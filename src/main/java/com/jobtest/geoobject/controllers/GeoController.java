package com.jobtest.geoobject.controllers;

import com.jobtest.geoobject.entities.Geoobject;
import com.jobtest.geoobject.repository.DataRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoController {

    private final DataRepository repository;

    public GeoController(DataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public Geoobject geoById(@PathVariable final Long id) {
        return repository.findById(id).get();
    }
}
