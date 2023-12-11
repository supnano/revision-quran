package com.laaribi.revisionquran.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;
/**
 * Learned soura entity
 */
@Data
@Entity
public class LearnedSoura {

    public LearnedSoura(Utilisateur utilisateur, Soura soura) {
        this.utilisateur=utilisateur;
        this.soura=soura;
        LearnedSouraKey learnedSouraKey = new LearnedSouraKey(utilisateur.getId(), soura.getId());
        this.id=learnedSouraKey;
    }

    public LearnedSoura(){

    }

    @EmbeddedId
    @JsonIgnore
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
