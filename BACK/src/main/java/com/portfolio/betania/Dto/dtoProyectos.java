
package com.portfolio.betania.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyectos {
     @NotBlank
   private String nombreP;
    @NotBlank
   private String descripcionP;

   
   
   //Contructores

    public dtoProyectos() {
        
    }
    
    public dtoProyectos(String nombreP, String descripcionP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
    }
    

     //Getters and Setters

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
      
}
