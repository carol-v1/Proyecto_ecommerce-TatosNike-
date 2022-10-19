package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository <Product, String>
{
}
