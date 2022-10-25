package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="categoria")
public class Categoria
{
    @Id
    private Long id;
    private String tipo;
}
