package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.UsuarioWeb;
import com.uam.eCommerceUltimate.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class impServiceUserDetails implements UserDetailsService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UsuarioWeb usuarioWeb = usuarioRepository
                .findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con email " + email + " no existe"));
        return new impUserDetails(usuarioWeb);
    }
}
