package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Producto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface IServiceProducto
{
    public List<Producto> getListProduct();

    public Producto findById (Long id);

    Producto saveProduct(String productDto, MultipartFile image) throws IOException;

    public void deleteProduct(Long id) throws IOException;
}
