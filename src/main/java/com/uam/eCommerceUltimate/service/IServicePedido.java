package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServicePedido {

    public List<Pedido> listAll();

    public Pedido findById(Long id);

    public Pedido savePedido(Pedido pedido);

    public void deleteProduct (Long id);
}
