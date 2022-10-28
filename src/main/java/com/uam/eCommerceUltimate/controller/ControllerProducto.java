package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.Producto;
import com.uam.eCommerceUltimate.service.IServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin
public class ControllerProducto
{
    @Qualifier("serviceProduct")
    @Autowired
    private IServiceProducto service;

    @GetMapping("/list")
    public List<Producto> getAll()
    {
        return service.getListProduct();
    }

    @PostMapping("/save")
    public Producto saveProduct(@RequestPart("producto") String productDto, @RequestPart("imagen") MultipartFile image) throws IOException {
        return service.saveProduct(productDto, image);
    }

    @GetMapping("/{id}")
    public Producto getProduct(@PathVariable Long id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) throws IOException {
        service.deleteProduct(id);
    }
}
