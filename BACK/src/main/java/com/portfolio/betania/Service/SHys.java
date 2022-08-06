
package com.portfolio.betania.Service;

import com.portfolio.betania.Entity.Hys;
import com.portfolio.betania.Repository.RHys;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SHys {
 
    @Autowired
    RHys rHys;

    public List<Hys> list() {
        return rHys.findAll();
    }

    public Optional<Hys> getOne(int id) {
        return rHys.findById(id);
    }
    
   public Optional <Hys> getByNombreH(String nombreH){
       return rHys.findByNombreH(nombreH);
   }
   
   public void save(Hys hys) {
       rHys.save(hys);
   }
   
   public void delete(int id){
       rHys.deleteById(id);
   }
   
   public boolean existsById(int id){
       return rHys.existsById(id);
   }
   
   public boolean existsByNombreH(String nombreH){
       return rHys.existsByNombreH(nombreH);
   }   
}
