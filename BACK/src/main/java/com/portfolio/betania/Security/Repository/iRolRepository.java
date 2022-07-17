
package com.portfolio.betania.Security.Repository;

import com.portfolio.betania.Security.Entity.Rol;
import com.portfolio.betania.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
 Optional<Rol> findByRolNombre(RolNombre rolNombre);   
}
