package com.laaribi.revisionquran.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laaribi.revisionquran.api.model.LearnedSoura;
import com.laaribi.revisionquran.api.model.Utilisateur;
import com.laaribi.revisionquran.api.repository.LearnedSouraRepository;
import lombok.Data;

@Data
@Service
public class LearnedSouraService {
    @Autowired
    private LearnedSouraRepository learnedSouraRepository;

    // public Optional<Set<Soura>> getLearndSoura(final Long idUtilisateur) {
    //     return learnedSouraRepository.;
    // }

    public Iterable<LearnedSoura> getSouwar(final Utilisateur utilisateur) {
        //return learnedSouraRepository.findAll();
        return learnedSouraRepository.findByUtilisateurIs(utilisateur);
    }
}
