package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.Producto;
import com.uam.eCommerceUltimate.service.IServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ControllerProduct
{
    @Qualifier("serviceProduct")
    @Autowired
    private IServiceProduct service;

    @GetMapping("/list")
    public List<Producto> getAll()
    {
        return service.getListProduct();
    }

    @PostMapping("/save")
    public Producto saveProduct(@RequestPart("product") String productDto, @RequestPart("image") MultipartFile image) throws IOException {
        return service.saveProduct(productDto, image);
    }

    @GetMapping("/{id}")
    public Producto getProduct(@PathVariable String id)
    {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable String id)
    {
        service.deleteProduct(id);
    }
}
