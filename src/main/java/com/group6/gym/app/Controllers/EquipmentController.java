package com.group6.gym.app.Controllers;

import com.group6.gym.app.entities.Equipment;
import com.group6.gym.app.Service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping
    public List<Equipment> getEquipment(){
        return equipmentService.getAll();
    }

    @GetMapping("/{id}")
    public Equipment getEquipment(@PathVariable("id") Long id) {
        return equipmentService.findById(id);
    }

    @PostMapping
    public void saveEquipment(@RequestBody Equipment equipment){
        equipmentService.guardar(equipment);
    }

    @PutMapping("/{id}")
    public void actualizarEquipment(@PathVariable("id") Long id, @RequestBody Equipment equipment) {
        equipment.setId(id);
        equipmentService.actualizar(equipment);
    }

    @DeleteMapping("/{id}")
    public void eliminarEquipment(@PathVariable("id") Long id) {
        equipmentService.eliminar(id);
    }
}

