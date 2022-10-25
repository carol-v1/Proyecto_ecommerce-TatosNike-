package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IServicePerson
{

    public List<Person> getListPerson();

    public Person findById(int id);

    Person savePerson (Person person);

    public void deletePerson(int id);

}
