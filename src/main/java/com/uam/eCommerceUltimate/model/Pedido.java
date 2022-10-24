package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="pedido")
public class Pedido
{
    @Id
    private Long id;
    private Integer estado;
}
