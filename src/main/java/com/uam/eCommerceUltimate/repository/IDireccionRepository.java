package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDireccionRepository extends JpaRepository <Direccion, Long> {
}
