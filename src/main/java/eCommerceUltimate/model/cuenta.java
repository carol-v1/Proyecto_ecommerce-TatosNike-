package eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="cuenta")
public class cuenta
{
    @Id
    private int id;
    private String direccionEnvio;
    private int tipo;
    private boolean activo;
}
