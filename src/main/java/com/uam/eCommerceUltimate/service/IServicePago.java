package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.pago;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServicePago
{
    public List<pago> getListPago();

    public pago findById (int id);

    public pago savePago (pago pago);

    public void deletePago (int id);
}
