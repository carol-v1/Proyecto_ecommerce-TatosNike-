package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Long> {
}
