package com.uam.eCommerceUltimate.service;


import com.uam.eCommerceUltimate.model.categoria;
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
    public List<categoria> getListCategoria()
    {
        return repo.findAll();
    }

    @Override
    public categoria findById(int id)
    {
        return repo.findById(id).get();
    }

    @Override
    public categoria saveCategoria(categoria categoria)
    {
        return repo.save(categoria);
    }

    @Override
    public void deleteCategoria(int id)
    {
        repo.deleteById(id);
    }
}
