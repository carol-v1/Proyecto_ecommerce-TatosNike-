package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Pedido;
import com.uam.eCommerceUltimate.model.Producto;
import com.uam.eCommerceUltimate.model.UsuarioWeb;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceUsuario {

    public List<UsuarioWeb> listAll();

    public UsuarioWeb findById(String id);

    public UsuarioWeb saveUsuario(UsuarioWeb usuarioWeb);

    public void deleteUsuario (String id);
}
