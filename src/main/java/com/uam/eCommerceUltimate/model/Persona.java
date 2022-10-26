package com.uam.eCommerceUltimate.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="Persona")
public class Persona
{
    @Id
    @SequenceGenerator(name = "persona_seq",
            sequenceName = "persona_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "persona_seq")
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private String celular;

    @OneToMany (mappedBy = "persona", cascade = CascadeType.ALL)
    private List<UsuarioWeb> usuariosWeb;
}
