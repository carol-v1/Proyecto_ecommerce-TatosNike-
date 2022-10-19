package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceProduct {

    public List<Product> getListProduct();

    public Product findById (String id);

    public Product saveProduct (Product product);

    public void deleteProduct(String id);

}
