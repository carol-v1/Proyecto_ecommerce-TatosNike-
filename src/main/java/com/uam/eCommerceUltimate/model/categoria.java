package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="categoria")
public class categoria
{
    @Id
    private int id;
    private String tipo;
}
