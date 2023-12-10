package com.laaribi.revisionquran.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laaribi.revisionquran.api.repository.SouraRepository;
import com.laaribi.revisionquran.api.model.Soura;

import lombok.Data;

@Data
@Service
public class SouraService {

    @Autowired
    private SouraRepository souraRepository;

    public Optional<Soura> getSoura(final Long id) {
        return souraRepository.findById(id);
    }

    public Iterable<Soura> getSouwar() {
        return souraRepository.findAll();
    }

}