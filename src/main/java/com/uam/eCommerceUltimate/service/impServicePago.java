package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Pago;
import com.uam.eCommerceUltimate.repository.IPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("servicePago")
public class impServicePago implements IServicePago
{
    @Autowired
    private IPagoRepository repo;

    @Override
    public List<Pago> getListPago()
    {
        return repo.findAll();
    }

    @Override
    public Pago findById(Long id)
    {
        return repo.findById(id).get();
    }

    @Override
    public Pago savePago(Pago pago)
    {
        return repo.save(pago);
    }

    @Override
    public void deletePago(Long id)
    {
        repo.deleteById(id);
    }
}
