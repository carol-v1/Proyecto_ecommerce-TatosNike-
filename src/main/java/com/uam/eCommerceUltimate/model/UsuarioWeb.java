package com.uam.eCommerceUltimate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="usuarioWeb")
public class UsuarioWeb
{
    @Id
    private String idLogin;
    private Integer contrasena;
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Persona personas;
}
