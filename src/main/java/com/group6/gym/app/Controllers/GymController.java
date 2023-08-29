package com.group6.gym.app.Controllers;

import com.group6.gym.app.Service.GymService;
import com.group6.gym.app.entities.Gym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/gym")
public class GymController {
    @Autowired
    private GymService gymService;

    @GetMapping
    public List<Gym> getMembership() {
        return gymService.getAll();
    }

    @GetMapping("/{id}")
    public Gym getGym(@PathVariable("id") Long id) {
        return gymService.findById(id);
    }

    @PostMapping
    public void saveGym(@RequestBody Gym gym) {
        gymService.guardar(gym);
    }

    @PutMapping("/{id}")
    public void actualizarGym(@PathVariable("id") Long id, @RequestBody Gym gym) {
        gym.setId(id);
        gymService.actualizar(gym);
    }

    @DeleteMapping("/{id}")
    public void eliminarGym(@PathVariable("id") Long id) {
        gymService.eliminar(id);
    }
}