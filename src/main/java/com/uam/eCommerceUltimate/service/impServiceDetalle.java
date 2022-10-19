package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.detalle;
import com.uam.eCommerceUltimate.repository.IDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceDetalle")
public class impServiceDetalle implements IServiceDetalle
{
    @Autowired
    private IDetalleRepository repo;

    @Override
    public List<detalle> getListDetalle()
    {
        return repo.findAll();
    }

    @Override
    public detalle findById(int id)
    {
        return repo.findById(id).get();
    }

    @Override
    public detalle saveDetalle(detalle detalle)
    {
        return repo.save(detalle);
    }

    @Override
    public void deleteDetalle(int id)
    {
        repo.deleteById(id);
    }
}
