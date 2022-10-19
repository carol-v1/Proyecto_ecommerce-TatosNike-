package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagoRepository extends JpaRepository<pago, Integer>
{
}
