package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IDetalleRepository extends JpaRepository <Detalle, UUID>
{
}
