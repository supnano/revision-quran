package com.laaribi.revisionquran.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laaribi.revisionquran.api.model.Utilisateur;
import com.laaribi.revisionquran.api.service.UtilisateurService;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    /**
    * Read - Get all utilisateurs
    * @return - An Iterable object of Utilisateur full filled
    */
    @GetMapping("/utilisateurs")
    public Iterable<Utilisateur> getUtilisateurs() {
        return utilisateurService.getUtilisateurs();
    }

    @GetMapping("/utilisateur/{id}")
    public Optional<Utilisateur> getUtilisateur(@PathVariable Long id) {
        return utilisateurService.getUtilisateur(id);
    }
    
}