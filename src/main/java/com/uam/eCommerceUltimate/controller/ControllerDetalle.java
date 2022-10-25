package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.detalle;
import com.uam.eCommerceUltimate.service.IServiceDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalle")
@CrossOrigin
public class ControllerDetalle
{
    @Qualifier("serviceDetalle")
    @Autowired
    private IServiceDetalle service;

    @GetMapping("/list")
    public List<detalle> getAll()
    {
        return service.getListDetalle();
    }

    @PostMapping("/save")
    public detalle saveDetalle(@RequestBody detalle detalle)
    {
        return service.saveDetalle(detalle);
    }

    @GetMapping("/{id}")
    public detalle getDetalle(@PathVariable Integer id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDetalle(@PathVariable Integer id)
    {
        service.deleteDetalle(id);
    }
}
