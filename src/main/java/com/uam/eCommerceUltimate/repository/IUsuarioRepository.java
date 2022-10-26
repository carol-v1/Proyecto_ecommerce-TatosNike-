package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.UsuarioWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioWeb,String>
{
}
