package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.categoria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public interface IServiceCategoria
{
    public List<categoria> getListCategoria();

    public categoria findById (int id);

    public categoria saveCategoria (categoria categoria);

    public void deleteCategoria(int id);
}
