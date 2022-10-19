package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name="detalle")
public class detalle
{
    @Id
    private int id;
    private Date diaOrden;
    private Date diaEntrega;
    private Date fechaPago;
    private double total;
}
