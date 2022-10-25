package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Detalle;
import com.uam.eCommerceUltimate.model.Pedido;
import com.uam.eCommerceUltimate.repository.IDetalleRepository;
import com.uam.eCommerceUltimate.repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("servicePedido")
public class impServicePedido implements IServicePedido{

    @Autowired
    private IPedidoRepository repo;

    @Autowired
    private IDetalleRepository repoDet;

    @Override
    public List<Pedido> listAll() {
        return repo.findAll();
    }

    @Override
    public Pedido findById(Long id) {
        return repo.findById(id).get();
    }


    @Override
    public Pedido savePedido(Pedido pedido) {
        Pedido o = new Pedido();
        o.setEstado(pedido.getEstado());
        List<Detalle> detalles = pedido.getDetalles();
        pedido.setDetalles(null);
        for (Detalle det : detalles){
            det.setPedido(o);
        }
        o.setDetalles(detalles);
        return repo.save(o);
    }
    @Override
    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}
