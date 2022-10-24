package com.uam.eCommerceUltimate.service;


import com.uam.eCommerceUltimate.model.Categoria;
import com.uam.eCommerceUltimate.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceCategoria")
public class impServiceCategoria implements IServiceCategoria
{
    @Autowired
    private ICategoriaRepository repo;

    @Override
    public List<Categoria> getListCategoria()
    {
        return repo.findAll();
    }

    @Override
    public Categoria findById(int id)
    {
        return repo.findById(id).get();
    }

    @Override
    public Categoria saveCategoria(Categoria categoria)
    {
        return repo.save(categoria);
    }

    @Override
    public void deleteCategoria(int id)
    {
        repo.deleteById(id);
    }
}
