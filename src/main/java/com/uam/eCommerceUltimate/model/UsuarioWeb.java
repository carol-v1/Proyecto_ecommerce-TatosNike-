package com.uam.eCommerceUltimate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="UsuarioWeb")
public class UsuarioWeb
{
    @Id
    private String id;
    private Long idPersona;
    private String contraseña;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Persona personas;
}
