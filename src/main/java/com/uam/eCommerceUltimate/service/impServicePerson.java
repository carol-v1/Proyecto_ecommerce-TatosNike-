package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Person;
import com.uam.eCommerceUltimate.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("servicePerson")
public class impServicePerson implements IServicePerson
{
    @Autowired
    private IPersonRepository repo;

    @Override
    public List<Person> getListPerson() {
        return repo.findAll();
    }

    @Override
    public Person findById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public Person savePerson(Person person) {
        return repo.save(person);
    }

    @Override
    public void deletePerson(int id) {
        repo.deleteById(id);

    }
}
