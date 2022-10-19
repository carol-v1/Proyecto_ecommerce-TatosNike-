package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Product;
import com.uam.eCommerceUltimate.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceProduct")
public class impServiceProduct implements IServiceProduct
{

    @Autowired
    private IProductRepository repo;

    @Override
    public List<Product> getListProduct()
    {
        return repo.findAll();
    }

    @Override
    public Product findById(String id)
    {
        return repo.findById(id).get();
    }

    @Override
    public Product saveProduct(Product product)
    {
        return repo.save(product);
    }

    @Override
    public void deleteProduct(String id)
    {
        repo.deleteById(id);
    }
}
