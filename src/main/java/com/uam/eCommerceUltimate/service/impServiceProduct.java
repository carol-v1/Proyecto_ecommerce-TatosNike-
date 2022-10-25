package com.uam.eCommerceUltimate.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uam.eCommerceUltimate.model.Producto;
import com.uam.eCommerceUltimate.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
@Component("serviceProduct")
public class impServiceProduct implements IServiceProduct
{

    @Autowired
    private IProductRepository repo;
    @Value("${ruta.archivos.imagen}")
    private String ruta;

    @Override
    public List<Producto> getListProduct()
    {
        return repo.findAll();
    }

    @Override
    public Producto findById(String id)
    {
        return repo.findById(id).get();
    }

    @Override
    public Producto saveProduct(String productDto, MultipartFile image) throws IOException {
        byte[] imgByte = image.getBytes();
        Path path = Paths.get(ruta + "//" + image.getOriginalFilename());
        if (!Files.exists(path)){
            Files.write(path,imgByte);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        Producto product = objectMapper.readValue(productDto, Producto.class);
        product.setImagen(image.getOriginalFilename());
        return repo.save(product);
    }

    @Override
    public void deleteProduct(String id)
    {
        repo.deleteById(id);
    }
}
