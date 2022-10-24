package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Cuenta;
import com.uam.eCommerceUltimate.repository.ICuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceCuenta")
public class impServiceCuenta implements IServiceCuenta
{
    @Autowired
    private ICuentaRepository repo;

    @Override
    public List<Cuenta> getListCuenta()
    {
        return repo.findAll();
    }

    @Override
    public Cuenta findById(int id)
    {
        return repo.findById(id).get();
    }

    @Override
    public Cuenta saveCuenta(Cuenta cuenta)
    {
        return repo.save(cuenta);
    }

    @Override
    public void deleteCuenta(int id)
    {
        repo.deleteById(id);
    }
}
