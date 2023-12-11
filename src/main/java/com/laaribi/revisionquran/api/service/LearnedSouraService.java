package com.laaribi.revisionquran.api.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laaribi.revisionquran.api.model.LearnedSoura;
import com.laaribi.revisionquran.api.model.LearnedSouraKey;
import com.laaribi.revisionquran.api.model.Soura;
import com.laaribi.revisionquran.api.model.Utilisateur;
import com.laaribi.revisionquran.api.repository.LearnedSouraRepository;
import lombok.Data;

@Data
@Service
public class LearnedSouraService {
    @Autowired
    private LearnedSouraRepository learnedSouraRepository;

    public Iterable<LearnedSoura> getSouwar(final Utilisateur utilisateur) {
        return learnedSouraRepository.findByUtilisateurIs(utilisateur);
    }

    public LearnedSoura saveLearnedSoura(Utilisateur utilisateur, Soura soura){
        LearnedSoura learnedSoura = new LearnedSoura(utilisateur,soura);
        learnedSoura.setLastDateRecitation(Calendar.getInstance().getTime());
        return learnedSouraRepository.save(learnedSoura);
    }
}
