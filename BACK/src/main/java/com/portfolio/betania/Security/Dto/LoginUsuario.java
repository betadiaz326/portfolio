/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.betania.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author 54354
 */
public class LoginUsuario {
    @NotBlank
    private String nombreUsuario;
     @NotBlank
    private String password;
    //Getter y setter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
}
