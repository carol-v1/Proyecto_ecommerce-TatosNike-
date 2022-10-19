package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Product")
public class Product
{
    @Id
    private String id;
    private String name;
    private String modelo;
    private  Byte[] imagen;
}
