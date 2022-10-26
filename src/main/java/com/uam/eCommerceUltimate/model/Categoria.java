package com.uam.eCommerceUltimate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="categoria")
public class Categoria
{
    @Id
    @SequenceGenerator(name = "categoria_seq",
            sequenceName = "categoria_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "categoria_seq")
    private Long id;
    private String tipo;
    private String genero;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Producto producto;
}
