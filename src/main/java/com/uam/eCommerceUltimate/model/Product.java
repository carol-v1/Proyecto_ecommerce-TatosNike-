package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Product")
public class Product
{
    @Id
    @SequenceGenerator(name = "order_seq",
            sequenceName = "order_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "order_seq")
    private String id;
    private String name;
    private String modelo;
    private  Byte[] imagen;
}
