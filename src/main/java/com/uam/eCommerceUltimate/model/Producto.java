package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name="Producto")
public class Producto
{
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String modelo;
    private String imagen;
}
