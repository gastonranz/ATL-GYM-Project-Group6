package com.group6.gym.app.Controllers;

import com.group6.gym.app.entities.Equipment;
import com.group6.gym.app.Service.EquipmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping
    public ResponseEntity<List<Equipment>> getEquipments() {
        try {
            List<Equipment> equipments = equipmentService.getAll();

            if (equipments.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(equipments, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipment> getEquipment(@PathVariable("id") Long id) {
        try {
            Optional<Equipment> equipment = equipmentService.findById(id);

            return equipment.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Equipment> saveEquipment(@RequestBody Equipment equipment) {
        try {
            Equipment equipmentSaved = equipmentService.guardar(equipment);

            if (equipmentSaved != null) {
                return new ResponseEntity<>(equipmentSaved, HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipment> actualizarEquipment(@PathVariable("id") Long id, @RequestBody Equipment equipment) {
        try {
            Optional<Equipment> equipmentData = equipmentService.findById(id);

            if (equipmentData.isPresent()) {
                Equipment equipmentUpdated = equipmentData.get();
                equipmentUpdated.setGym(equipment.getGym());
                equipmentUpdated.setProductName(equipment.getProductName());
                equipmentUpdated.setDescription(equipment.getDescription());
                equipmentUpdated.setBuyTime(equipment.getBuyTime());
                equipmentUpdated.setStatus(equipment.getStatus());
                return new ResponseEntity<>(equipmentService.actualizar(equipmentUpdated), HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Equipment> eliminarEquipment(@PathVariable("id") Long id) {
        try {
            Optional<Equipment> equipment = equipmentService.findById(id);

            if(equipment.isPresent()) {
                equipmentService.eliminar(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

