package com.uam.eCommerceUltimate.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Person")
public class Person
{
    @Id
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private String celular;
}
