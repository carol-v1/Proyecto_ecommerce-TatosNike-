package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="cuenta")
public class Cuenta
{
    @Id
    private Long id;
    private String direccionEnvio;
    private Long tipo;
    private boolean activo;
}
