package com.laaribi.revisionquran.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.laaribi.revisionquran.api.model.LearnedSoura;
import com.laaribi.revisionquran.api.model.Utilisateur;

public interface LearnedSouraRepository extends CrudRepository<LearnedSoura, Long> {

    public Iterable<LearnedSoura> findByUtilisateurIs(Utilisateur utilisateur);
}
