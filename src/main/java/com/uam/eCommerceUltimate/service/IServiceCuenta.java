package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Cuenta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCuenta
{
    public List<Cuenta> getListCuenta();

    public Cuenta findById (int id);

    public Cuenta saveCuenta (Cuenta cuenta);

    public void deleteCuenta(int id);
}
