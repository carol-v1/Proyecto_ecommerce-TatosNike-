package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.service.IServicePerson;
import com.uam.eCommerceUltimate.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
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
    public Persona savePerson (@RequestBody Persona person){
        return service.savePerson(person);
    }

    @GetMapping("/{id}")
    public Persona getPerson (@PathVariable Integer id){
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson (@PathVariable Integer id){
        service.deletePerson(id);

    }
}
