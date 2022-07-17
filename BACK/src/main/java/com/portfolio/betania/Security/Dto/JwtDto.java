/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.betania.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;


public class JwtDto {
 private String token;
 private String bearer = "Bearer";
 private String nombreUsuario;
 private Collection<? extends GrantedAuthority> autorities;
 
 //Constructor

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> autorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.autorities = autorities;
    }
 //Getter y Setter

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAutorities() {
        return autorities;
    }

    public void setAutorities(Collection<? extends GrantedAuthority> autorities) {
        this.autorities = autorities;
    }
    
}
