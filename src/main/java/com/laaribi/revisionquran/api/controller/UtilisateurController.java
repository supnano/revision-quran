package com.laaribi.revisionquran.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laaribi.revisionquran.api.model.Utilisateur;
import com.laaribi.revisionquran.api.service.UtilisateurService;


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


}