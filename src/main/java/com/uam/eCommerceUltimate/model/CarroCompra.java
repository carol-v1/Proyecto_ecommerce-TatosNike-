package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name="carroCompra")
public class CarroCompra
{
    @Id
    private Long id;
    private Date productoAgregado;
}