package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Pago;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServicePago
{
    public List<Pago> getListPago();

    public Pago findById (Long id);

    public Pago savePago (Pago pago);

    public void deletePago (Long id);
}
