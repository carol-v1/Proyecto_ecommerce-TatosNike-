package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.Service.IServicePerson;
import com.uam.eCommerceUltimate.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@CrossOrigin
public class ControllerPerson {

    @Qualifier("servicePerson")
    @Autowired
    private IServicePerson service;

    @GetMapping("/list")
    public List<Person> getAll() {
        return service.getListPerson();
    }

    @PostMapping("/save")
    public Person savePerson (@RequestBody Person person){
        return service.savePerson(person);
    }

    @GetMapping("/{id}")
    public Person getPerson (@PathVariable Integer id){
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson (@PathVariable Integer id){
        service.deletePerson(id);

    }
}
