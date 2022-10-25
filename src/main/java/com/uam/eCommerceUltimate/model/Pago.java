package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="pago")
public class Pago
{
    @Id
    private Long id;
    private String cvv;
    private String compania;
    private String fechaCaducidad;
    private String numeroTarjeta;
}
