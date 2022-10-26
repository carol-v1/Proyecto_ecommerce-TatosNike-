package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="categoria")
public class Categoria
{
    @Id
    @SequenceGenerator(name = "categoria_seq",
            sequenceName = "categoria_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "categoria_seq")
    private Long id;
    private String tipo;
}
