package com.group6.gym.app.Service;


import com.group6.gym.app.entities.Equipment;

import java.util.List;
import java.util.Optional;

public interface EquipmentService {
    List<Equipment> getAll();

    Optional<Equipment> findById(Long id);

    Equipment guardar(Equipment equipment);

    Equipment actualizar(Equipment equipment);
    void eliminar(Long id);

}
