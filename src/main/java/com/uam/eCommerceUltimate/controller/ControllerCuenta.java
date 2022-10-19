package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.cuenta;
import com.uam.eCommerceUltimate.service.IServiceCuenta;
import com.uam.eCommerceUltimate.service.IServiceProduct;
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
    public List<cuenta> getAll()
    {
        return service.getListCuenta();
    }

    @PostMapping("/save")
    public cuenta saveCuenta(@RequestBody cuenta cuenta)
    {
        return service.saveCuenta(cuenta);
    }

    @GetMapping("/{id}")
    public cuenta getCuenta(@PathVariable Integer id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCuenta(@PathVariable Integer id)
    {
        service.deleteCuenta(id);
    }
}
