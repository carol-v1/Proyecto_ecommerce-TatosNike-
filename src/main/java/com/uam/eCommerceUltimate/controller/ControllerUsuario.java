package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.Producto;
import com.uam.eCommerceUltimate.model.UsuarioWeb;
import com.uam.eCommerceUltimate.service.IServiceProducto;
import com.uam.eCommerceUltimate.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class ControllerUsuario {

    @Qualifier("serviceUsuario")
    @Autowired
    private IServiceUsuario service;

    @GetMapping("/list")
    public List<UsuarioWeb> getAll(){
        return service.listAll();
    }

    @PostMapping("/save")
    public UsuarioWeb saveUsuario(@RequestBody UsuarioWeb usuarioWeb){
        return service.saveUsuario(usuarioWeb);
    }

    @GetMapping({"/{id}"})
    public UsuarioWeb getUsuario(@PathVariable String id){
        return service.findById(id);
    }

    @DeleteMapping({"/delete/{id}"})
    public void deleteUsuario(@PathVariable String id){
        service.deleteUsuario(id);
    }

}
