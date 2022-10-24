package com.uam.eCommerceUltimate.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Persona")
public class Persona
{
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private String celular;
}
