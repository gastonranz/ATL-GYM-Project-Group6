package com.group6.gym.app.Service;


import com.group6.gym.app.entities.Equipment;

import java.util.List;

public interface EquipmentService {
    List<Equipment> getAll();

    Equipment findById(Long id);

    void guardar(Equipment equipment);

    void actualizar(Equipment equipment);

    void eliminar(Long id);

}
