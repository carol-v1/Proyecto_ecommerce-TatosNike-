package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.detalle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceDetalle
{
    public List<detalle> getListDetalle();

    public detalle findById (int id);

    public detalle saveDetalle (detalle detalle);

    public void deleteDetalle(int id);
}
