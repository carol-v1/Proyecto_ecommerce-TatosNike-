package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IServicePerson
{

    public List<Persona> getListPerson();

    public Persona findById(int id);

    Persona savePerson (Persona person);

    public void deletePerson(int id);

}
