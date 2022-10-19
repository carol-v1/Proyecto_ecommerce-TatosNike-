package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.cuenta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCuenta
{
    public List<cuenta> getListCuenta();

    public cuenta findById (int id);

    public cuenta saveCuenta (cuenta cuenta);

    public void deleteCuenta(int id);
}
