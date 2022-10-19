package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="usuarioWeb")
public class usuarioWeb
{
    @Id
    private String idLogin;
    private int contrasena;
    private int estado;
}
