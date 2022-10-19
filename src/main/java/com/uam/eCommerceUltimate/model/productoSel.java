package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="prodcutoSel")
public class productoSel
{
    @Id
    private int cantidad;
    private double precio;
}
