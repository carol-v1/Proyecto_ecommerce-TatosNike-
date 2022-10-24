package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Detalle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceDetalle
{
    public List<Detalle> getListDetalle();

    public Detalle findById (int id);

    public Detalle saveDetalle (Detalle detalle);

    public void deleteDetalle(int id);
}
