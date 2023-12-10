package com.laaribi.revisionquran.api.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;

@Data
@Entity
public class LearnedSoura {

    @EmbeddedId
    LearnedSouraKey id;

    @ManyToOne
    @MapsId("utilisateurId")
    @JoinColumn(name = "utilisateur_id")
    Utilisateur utilisateur;

    @ManyToOne
    @MapsId("souraId")
    @JoinColumn(name = "soura_id")
    Soura soura;

    @Column(name = "last_date_recitation")
    Date lastDateRecitation;
}
