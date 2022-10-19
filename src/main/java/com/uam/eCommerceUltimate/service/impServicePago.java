package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.pago;
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
    public List<pago> getListPago()
    {
        return repo.findAll();
    }

    @Override
    public pago findById(int id)
    {
        return repo.findById(id).get();
    }

    @Override
    public pago savePago(pago pago)
    {
        return repo.save(pago);
    }

    @Override
    public void deletePago(int id)
    {
        repo.deleteById(id);
    }
}
