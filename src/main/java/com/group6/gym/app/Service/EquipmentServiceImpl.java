package com.group6.gym.app.Service;

import com.group6.gym.app.Entities.Equipment;
import com.group6.gym.app.Repository.EquipmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class EquipmentServiceImpl implements EquipmentService{
    @Autowired
    private EquipmentRepository equipmentService;
    @Override
    public List<Equipment> getAll() {
        return equipmentService.getAll();
    }

    @Override
    public Equipment findById(Long id) {
        return equipmentService.findById(id);
    }

    @Override
    public void guardar(Equipment equipment) {
        equipmentService.guardar(equipment);

    }

    @Override
    public void actualizar(Equipment equipment) {
        equipmentService.actualizar(equipment);
    }

    @Override
    public void eliminar(Long id) {
        equipmentService.eliminar(id);
    }
}
