package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.pago;
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
    public List<pago> getAll()
    {
        return service.getListPago();
    }

    @PostMapping("/save")
    public pago savePago(@RequestBody pago pago)
    {
        return service.savePago(pago);
    }

    @GetMapping("/{id}")
    public pago getPago(@PathVariable Integer id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePago(@PathVariable Integer id)
    {
        service.deletePago(id);
    }
}
