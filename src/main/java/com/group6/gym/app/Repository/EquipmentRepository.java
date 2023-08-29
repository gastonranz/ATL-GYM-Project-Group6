package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.Equipment;

import java.util.List;
import java.util.Optional;

public interface EquipmentRepository {
    List<Equipment> getAll();

    Optional<Equipment> findById(Long id);

    Equipment guardar(Equipment equipment);

    Equipment actualizar(Equipment equipment);

    void eliminar(Long id);

}
