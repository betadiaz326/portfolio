
package com.portfolio.betania.Repository;

import com.portfolio.betania.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer> {
     public Optional<Proyectos> findByNombreP(String nombreP);  
     public boolean existsByNombreP(String nombreP);

}
