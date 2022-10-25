package com.uam.eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="Pedidos")
public class Pedido
{
    @Id
    @SequenceGenerator(name = "pedido_seq",
            sequenceName = "pedido_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "pedido_seq")
    private Long id;
    private String estado;

    @OneToMany (mappedBy = "detalle", cascade = CascadeType.ALL)
    private List<Detalle> detalles;
}
