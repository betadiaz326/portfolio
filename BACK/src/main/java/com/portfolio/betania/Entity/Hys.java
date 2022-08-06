
package com.portfolio.betania.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hys {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreH;
    private String porcentajeH;
    private String imagenH;

    //constructores
    public Hys() {
    }

    public Hys(String nombreH, String porcentajeH, String imagenH) {
         this.nombreH = nombreH;
        this.porcentajeH = porcentajeH;
        this.imagenH = imagenH;
    }

    //getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
