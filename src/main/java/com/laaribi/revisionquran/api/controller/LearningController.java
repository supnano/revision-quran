package com.laaribi.revisionquran.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laaribi.revisionquran.api.model.LearnedSoura;
import com.laaribi.revisionquran.api.model.Soura;
import com.laaribi.revisionquran.api.model.Utilisateur;
import com.laaribi.revisionquran.api.service.LearnedSouraService;
import com.laaribi.revisionquran.api.service.UtilisateurService;

@RestController
public class LearningController {

    @Autowired
    private LearnedSouraService learnedSouraService;

    @Autowired
    private UtilisateurService utilisateurService;

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
}
