package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.service.IServicePerson;
import com.uam.eCommerceUltimate.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
@CrossOrigin
public class ControllerPerson{

    @Qualifier("servicePerson")
    @Autowired
    private IServicePerson service;

    @GetMapping("/list")
    public List<Persona> getAll() {
        return service.getListPerson();
    }

    @PostMapping("/save")
    public Persona savePerson (@RequestBody Persona persona){
        return service.savePerson(persona);
    }

    @GetMapping("/{id}")
    public Persona getPerson (@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson (@PathVariable Long id){
        service.deletePerson(id);

    }
}
