package com.laaribi.revisionquran.api.model;

import lombok.Data;


@Data
public class UtilisateurLearnedSoura {
    private Long id;

    private String name;

    private String latinName;

    Date lastDateRecitation;

    public UtilisateurLearnedSoura(){

    }

    public UtilisateurLearnedSoura(Long id, String name, String latinName, Date lastDateRecitation){
        this.id=id;
        this.name=name;
        this.latinName=latinName;
        this.lastDateRecitation=lastDateRecitation;

    }
}
