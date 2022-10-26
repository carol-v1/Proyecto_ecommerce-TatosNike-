package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name="Producto")
public class Producto
{
    @Id
    @SequenceGenerator(name = "producto_seq",
            sequenceName = "producto_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "producto_seq")
    private Long id;
    private String name;
    private String modelo;
    private String imagen;

    @OneToMany (mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Categoria> categorias;
}
