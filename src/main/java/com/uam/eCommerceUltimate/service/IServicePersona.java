package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IServicePersona
{

    public List<Persona> getListPerson();

    public Persona findById(Long id);

    Persona savePerson (Persona person);

    public void deletePerson(Long id);

}
