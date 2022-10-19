package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends JpaRepository <categoria, Integer>
{
}
