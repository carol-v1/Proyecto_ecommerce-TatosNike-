package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>
{
}
