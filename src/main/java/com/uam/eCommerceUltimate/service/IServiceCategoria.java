package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCategoria
{
    public List<Categoria> getListCategoria();

    public Categoria findById (Long id);

    public Categoria saveCategoria (Categoria categoria);

    public void deleteCategoria(Long id);
}
