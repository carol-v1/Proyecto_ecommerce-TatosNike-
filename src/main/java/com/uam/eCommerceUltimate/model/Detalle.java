package com.uam.eCommerceUltimate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name="Detalle")
public class Detalle
{
    @Id
    @GeneratedValue
    private UUID id;
    private Long idProducto;
    private Date diaOrden;
    private Date diaEntrega;
    private Date fechaPago;
    private double total;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Pedido pedido;

}
