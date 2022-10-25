package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Detalle;
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
    public List<Detalle> getListDetalle()
    {
        return repo.findAll();
    }

    @Override
    public Detalle findById(int id)
    {
        return repo.findById(id).get();
    }

    @Override
    public Detalle saveDetalle(Detalle detalle)
    {
        return repo.save(detalle);
    }

    @Override
    public void deleteDetalle(int id)
    {
        repo.deleteById(id);
    }
}
