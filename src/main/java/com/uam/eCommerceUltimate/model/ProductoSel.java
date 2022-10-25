package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="prodcutoSel")
public class ProductoSel
{
    @Id
    private Long id;
    private Integer cantidad;
    private Double precio;
}
