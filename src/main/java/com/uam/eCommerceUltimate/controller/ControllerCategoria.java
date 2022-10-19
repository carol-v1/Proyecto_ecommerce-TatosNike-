package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.categoria;
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
    public List<categoria> getAll()
    {
        return service.getListCategoria();
    }

    @PostMapping("/save")
    public categoria saveCategoria(@RequestBody categoria categoria)
    {
        return service.saveCategoria(categoria);
    }

    @GetMapping("/{id}")
    public categoria getCategoria(@PathVariable Integer id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategoria(@PathVariable Integer id)
    {
        service.deleteCategoria(id);
    }
}
