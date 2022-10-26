package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.Categoria;
import com.uam.eCommerceUltimate.service.IServiceCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
@CrossOrigin
public class ControllerCategoria
{
    @Qualifier("serviceCategoria")
    @Autowired
    private IServiceCategoria service;

    @GetMapping("/list")
    public List<Categoria> getAll()
    {
        return service.getListCategoria();
    }

    @PostMapping("/save")
    public Categoria saveCategoria(@RequestBody Categoria categoria)
    {
        return service.saveCategoria(categoria);
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable Long id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategoria(@PathVariable Long id)
    {
        service.deleteCategoria(id);
    }
}
