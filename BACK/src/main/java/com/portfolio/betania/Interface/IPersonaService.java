package com.portfolio.betania.Interface;

import com.portfolio.betania.Entity.Persona;
import java.util.List;



public interface IPersonaService {
  //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guarda un objeto del tipo persona
    public void savePersona( Persona persona);
    
    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
