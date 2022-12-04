package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.UsuarioWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioWeb, String>
{
    Optional<UsuarioWeb> findOneByEmail(String email);
}
