package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICuentaRepository extends JpaRepository <cuenta, Integer>
{
}
