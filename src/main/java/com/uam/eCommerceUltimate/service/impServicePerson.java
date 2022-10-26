package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Persona;
import com.uam.eCommerceUltimate.model.UsuarioWeb;
import com.uam.eCommerceUltimate.repository.IPersonRepository;
import com.uam.eCommerceUltimate.repository.IUsuarioRepository;
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

    @Autowired
    private IUsuarioRepository repoDet;

    @Override
    public List<Persona> getListPerson() {
        return repo.findAll();
    }

    @Override
    public Persona findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Persona savePerson(Persona person)
    {
        Persona o = new Persona();
        o.setNombre(person.getNombre());
        o.setApellido(person.getApellido());
        o.setDireccion(person.getDireccion());
        o.setEmail(person.getEmail());
        o.setCelular(person.getCelular());
        List<UsuarioWeb> usuarioWebs = person.getUsuariosWeb();
        person.setUsuariosWeb(null);
        for (UsuarioWeb det : usuarioWebs){
            det.setPersonas(o);
        }
        o.setUsuariosWeb(usuarioWebs);
        return repo.save(o);

    }

    @Override
    public void deletePerson(Long id) {
        repo.deleteById(id);
    }
}
