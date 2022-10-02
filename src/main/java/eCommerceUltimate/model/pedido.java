package eCommerceUltimate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="pedido")
public class pedido
{
    @Id
    private int id;
    private int estado;
}
