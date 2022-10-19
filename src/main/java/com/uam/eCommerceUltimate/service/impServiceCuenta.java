package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.cuenta;
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
    public List<cuenta> getListCuenta()
    {
        return repo.findAll();
    }

    @Override
    public cuenta findById(int id)
    {
        return repo.findById(id).get();
    }

    @Override
    public cuenta saveCuenta(cuenta cuenta)
    {
        return repo.save(cuenta);
    }

    @Override
    public void deleteCuenta(int id)
    {
        repo.deleteById(id);
    }
}
