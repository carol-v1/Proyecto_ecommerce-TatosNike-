package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="usuarioWeb")
public class UsuarioWeb
{
    @Id
    private String idLogin;
    private Integer contrasena;
    private Integer estado;
}
