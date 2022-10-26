package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository <Producto, Long>
{
}
