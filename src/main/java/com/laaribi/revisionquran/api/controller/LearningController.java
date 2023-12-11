package com.laaribi.revisionquran.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laaribi.revisionquran.api.model.LearnedSoura;
import com.laaribi.revisionquran.api.model.LearnedSouraKey;
import com.laaribi.revisionquran.api.model.Soura;
import com.laaribi.revisionquran.api.model.Utilisateur;
import com.laaribi.revisionquran.api.service.LearnedSouraService;
import com.laaribi.revisionquran.api.service.SouraService;
import com.laaribi.revisionquran.api.service.UtilisateurService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class LearningController {

    @Autowired
    private LearnedSouraService learnedSouraService;

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private SouraService souraService;

    @GetMapping("/learning/utilisateur/{id}")
    public Iterable<Soura> getUtilisateur(@PathVariable Long id) {
        List<Soura> souwar = new ArrayList<Soura>();
        Optional<Utilisateur> optionalUtilisateur = utilisateurService.getUtilisateur(id);
        // test optional is present befor get souwar
        Iterable<LearnedSoura> learnedSouwar = learnedSouraService.getSouwar(optionalUtilisateur.get());
        for (LearnedSoura learnedSoura : learnedSouwar) {
            souwar.add(learnedSoura.getSoura());
        }
        return souwar;
    }

    @PostMapping("/learning/learned-soura")
    public Iterable<LearnedSoura> learnedSoura(@RequestBody LearnedSouraKey learnedSouraKey) {
        Iterable<LearnedSoura> learnedSoura = null;
        Long souraId = learnedSouraKey.getSouraId();
        Long utilisateurId = learnedSouraKey.getUtilisateurId();
        if( souraId != null && utilisateurId != null){
            Soura soura = souraService.getSoura(souraId).get();
            Utilisateur utilisateur = utilisateurService.getUtilisateur(utilisateurId).get();
            if(soura!=null && utilisateur!=null){
                
                learnedSouraService.saveLearnedSoura(utilisateur, soura);
                learnedSoura = learnedSouraService.getSouwar(utilisateur);
            }
        }
        
        return learnedSoura;
    }
    
}
