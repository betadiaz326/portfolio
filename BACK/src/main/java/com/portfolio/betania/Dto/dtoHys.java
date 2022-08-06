
package com.portfolio.betania.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
   
     @NotBlank
    private String nombreH;
    @NotBlank
    private String porcentajeH;
    @NotBlank
    private String imagenH;

    //Contructores
    public dtoHys() {
    }

    public dtoHys(String nombreH, String porcentajeH, String imagenH) {
        this.nombreH = nombreH;
        this.porcentajeH = porcentajeH;
        this.imagenH = imagenH;
    }

    // getters and setters
    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getPorcentajeH() {
        return porcentajeH;
    }

    public void setPorcentajeH(String porcentajeH) {
        this.porcentajeH = porcentajeH;
    }

    public String getImagenH() {
        return imagenH;
    }

    public void setImagenH(String imagenH) {
        this.imagenH = imagenH;
    }

}
