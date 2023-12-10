package com.laaribi.revisionquran.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laaribi.revisionquran.api.model.Soura;
import com.laaribi.revisionquran.api.service.SouraService;


@RestController
public class SouraController {

    @Autowired
    private SouraService souraService;

    /**
    * Read - Get all souras
    * @return - An Iterable object of Soura full filled
    */
    @GetMapping("/souras")
    public Iterable<Soura> getSouras() {
        return souraService.getSouras();
    }


}