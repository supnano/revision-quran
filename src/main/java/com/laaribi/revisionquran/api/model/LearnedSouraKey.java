package com.laaribi.revisionquran.api.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class LearnedSouraKey implements Serializable{

    @Column(name = "utilisateur_id")
    Long utilisateurId;

    @Column(name = "soura_id")
    Long souraId;

    public boolean equals(LearnedSouraKey learnedSouraKey){
        return this.souraId.equals(learnedSouraKey.getSouraId()) && this.utilisateurId.equals(learnedSouraKey.getUtilisateurId());
    }

    public int hashCode(){
        return this.souraId.hashCode()*3+this.utilisateurId.hashCode()*2;
    }

    public LearnedSouraKey(Long utilisateurId, Long souraId) {
        this.utilisateurId=utilisateurId;
        this.souraId=souraId;
    }

    public LearnedSouraKey() {
    }

    
}
