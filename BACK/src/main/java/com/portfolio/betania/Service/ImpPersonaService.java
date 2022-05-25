package com.portfolio.betania.Service;

import com.portfolio.betania.Entity.Persona;
import com.portfolio.betania.Interface.IPersonaService;
import com.portfolio.betania.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
     List<Persona> persona = ipersonaRepository.findAll();
     return persona;
    }

    @Override
    public void savePersona(Persona persona) {
     ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
    ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
    Persona persona = ipersonaRepository.findById(id).orElse(null);
    return persona;
    }
    
}
