package com.uam.eCommerceUltimate.controller;

import com.uam.eCommerceUltimate.model.Product;
import com.uam.eCommerceUltimate.service.IServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ControllerProduct {

    @Qualifier("serviceProduct")
    @Autowired
    private IServiceProduct service;

    @GetMapping("/list")
    public List<Product> getAll(){
        return service.getListProduct();
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable String id){
        service.deleteProduct(id);
    }


}
