package com.laaribi.revisionquran.api.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LearnedSouraKey implements Serializable{

    @Column(name = "utilisateur_id")
    Long utilisateurId;

    @Column(name = "soura_id")
    Long souraId;

}
