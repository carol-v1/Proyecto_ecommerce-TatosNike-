package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleRepository extends JpaRepository <detalle, Integer>
{
}
