package com.laaribi.revisionquran.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laaribi.revisionquran.api.model.Soura;
import com.laaribi.revisionquran.api.service.SouraService;



@RestController
public class SouraController {

    @Autowired
    private SouraService souraService;

    /**
    * Read - Get all souwar
    * @return - An Iterable object of Soura full filled
    */
    @GetMapping("/souras")
    public Iterable<Soura> getSouras() {
        return souraService.getSouwar();
    }


    /**
     * Read - get soura by id
     */
    @GetMapping("/soura/{id}")
    public Optional<Soura> getSoura(@PathVariable Long id) {
        return souraService.getSoura(id);
    }
}