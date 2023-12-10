package com.laaribi.revisionquran.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.laaribi.revisionquran.api.model.LearnedSoura;
import com.laaribi.revisionquran.api.model.Utilisateur;

public interface LearnedSouraRepository extends CrudRepository<LearnedSoura, Long> {

    //@Query("SELECT LS FROM LearnedSoura as LS where UTILISATEUR_ID = ?1")
    public Iterable<LearnedSoura> findByUtilisateurIs(Utilisateur utilisateur);
}
