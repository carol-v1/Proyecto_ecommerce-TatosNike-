package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.Pago;
import com.uam.eCommerceUltimate.service.IServicePago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pago")
@CrossOrigin
public class ControllerPago
{
    @Qualifier("servicePago")
    @Autowired
    private IServicePago service;

    @GetMapping("/list")
    public List<Pago> getAll()
    {
        return service.getListPago();
    }

    @PostMapping("/save")
    public Pago savePago(@RequestBody Pago pago)
    {
        return service.savePago(pago);
    }

    @GetMapping("/{id}")
    public Pago getPago(@PathVariable Long id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePago(@PathVariable Long id)
    {
        service.deletePago(id);
    }
}
