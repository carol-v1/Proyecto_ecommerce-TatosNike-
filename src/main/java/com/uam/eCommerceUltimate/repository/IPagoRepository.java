package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Long>
{
}
