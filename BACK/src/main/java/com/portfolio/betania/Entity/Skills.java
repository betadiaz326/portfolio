
package com.portfolio.betania.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkilll;
    private String nombreSkill;
    private String FotoSkill;
    private int porcentaje;

    public Skills() {
    }

    public Skills(Long idSkilll, String nombreSkill, String FotoSkill, int porcentaje) {
        this.idSkilll = idSkilll;
        this.nombreSkill = nombreSkill;
        this.FotoSkill = FotoSkill;
        this.porcentaje = porcentaje;
    }

    public Long getIdSkilll() {
        return idSkilll;
    }

    public void setIdSkilll(Long idSkilll) {
        this.idSkilll = idSkilll;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getFotoSkill() {
        return FotoSkill;
    }

    public void setFotoSkill(String FotoSkill) {
        this.FotoSkill = FotoSkill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
