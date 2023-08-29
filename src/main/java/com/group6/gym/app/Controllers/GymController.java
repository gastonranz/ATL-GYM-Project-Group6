package com.group6.gym.app.Controllers;

import com.group6.gym.app.Service.GymService;
import com.group6.gym.app.entities.Gym;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/gym")
public class GymController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private GymService gymService;

    @GetMapping
    public ResponseEntity<List<Gym>> getMembership() {
        try {
            List<Gym> gymList = gymService.getAll();

            if (gymList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            return new ResponseEntity<>(gymList, HttpStatus.OK);
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gym> getGym(@PathVariable("id") Long id) {
        try {
            Optional<Gym> gym = gymService.findById(id);

            return gym.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Gym> saveGym(@RequestBody Gym gym) {
        try {
            Gym gymSaved = gymService.guardar(gym);

            if (gymSaved != null)
                return new ResponseEntity<>(gymSaved, HttpStatus.CREATED);
            else
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gym> actualizarGym(@PathVariable("id") Long id, @RequestBody Gym gym) {
        try {
            Optional<Gym> gymData = gymService.findById(id);

            if(gymData.isPresent()) {
                Gym gymUpdated = gymData.get();
                gymUpdated.setUsuarios(gym.getUsuarios());
                gymUpdated.setEmployees(gym.getEmployees());
                gymUpdated.setEquipments(gym.getEquipments());
                gymUpdated.setName(gym.getName());
                gymUpdated.setEmail(gym.getEmail());
                gymUpdated.setPhone_number(gym.getPhone_number());
                gymUpdated.setWeb(gym.getWeb());
                gymUpdated.setAddress(gym.getAddress());
                gymUpdated.setCity(gym.getCity());
                gymUpdated.setCp(gym.getCp());
                return new ResponseEntity<>(gymService.actualizar(gymUpdated), HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Gym> eliminarGym(@PathVariable("id") Long id) {
        try {
            Optional<Gym> gym = gymService.findById(id);
            if(gym.isPresent()) {
                gymService.eliminar(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}