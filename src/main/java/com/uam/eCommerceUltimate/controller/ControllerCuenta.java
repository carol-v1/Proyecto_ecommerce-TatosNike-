package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
@CrossOrigin
public class ControllerCuenta
{
    @Qualifier("serviceCuenta")
    @Autowired
    private IServiceCuenta service;

    @GetMapping("/list")
    public List<Cuenta> getAll()
    {
        return service.getListCuenta();
    }

    @PostMapping("/save")
    public Cuenta saveCuenta(@RequestBody Cuenta cuenta)
    {
        return service.saveCuenta(cuenta);
    }

    @GetMapping("/{id}")
    public Cuenta getCuenta(@PathVariable Integer id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCuenta(@PathVariable Integer id)
    {
        service.deleteCuenta(id);
    }
}
