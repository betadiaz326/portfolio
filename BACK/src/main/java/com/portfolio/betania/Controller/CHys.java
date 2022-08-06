package com.portfolio.betania.Controller;

import com.portfolio.betania.Dto.dtoHys;
import com.portfolio.betania.Service.SHys;
import com.portfolio.betania.Entity.Hys;
import com.portfolio.betania.Security.Controller.Mensaje;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hys")
@CrossOrigin(origins = "https://argentinaprogramback.herokuapp.com/hys")
 public class CHys {
    
  @Autowired
    SHys sHys;

    @GetMapping("/lista")
    public ResponseEntity<List< Hys>> list() {
        List<Hys> list = sHys.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }   
 
     @GetMapping("/detail/{id}")
    public ResponseEntity<Hys> getById(@PathVariable("id") int id) {
        if (!sHys.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Hys hys = sHys.getOne(id).get();
        return new ResponseEntity(hys, HttpStatus.OK);
    }
    
       @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHys.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sHys.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
      @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHys dtohys) {
        if (StringUtils.isBlank(dtohys.getNombreH())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sHys.existsByNombreH(dtohys.getNombreH())) {
            return new ResponseEntity(new Mensaje("Esa habilidad existe"), HttpStatus.BAD_REQUEST);
        }

        Hys hys = new Hys(dtohys.getNombreH(), dtohys.getPorcentajeH(), dtohys.getImagenH());
        sHys.save(hys);

        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHys dtohys) {
        //validamos ID
        if (!sHys.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //compara nombres de experiencias
        if (sHys.existsByNombreH(dtohys.getNombreH()) && sHys.getByNombreH(dtohys.getNombreH()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Habilidad existente"), HttpStatus.BAD_REQUEST);
        }
        // no puede estar vacio
        if (StringUtils.isBlank(dtohys.getNombreH())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Hys hys = sHys.getOne(id).get();
        hys.setNombreH(dtohys.getNombreH());
        hys.setImagenH(dtohys.getImagenH());
        hys.setPorcentajeH(dtohys.getPorcentajeH());

        sHys.save(hys);
        return new ResponseEntity(new Mensaje("Habilidad Actualizada"), HttpStatus.OK);
    }

}
