package com.uam.eCommerceUltimate.service;

import com.uam.eCommerceUltimate.model.UsuarioWeb;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@AllArgsConstructor
public class impUserDetails implements UserDetails {

    private final UsuarioWeb usuarioWeb;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return usuarioWeb.getContraseña();
    }

    @Override
    public String getUsername() {
        return usuarioWeb.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getNombre(){
        return usuarioWeb.getNombres();
    }
}
