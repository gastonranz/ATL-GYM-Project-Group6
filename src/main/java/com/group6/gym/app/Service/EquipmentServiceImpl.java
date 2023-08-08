package com.group6.gym.app.Service;

import com.group6.gym.app.Repository.EquipmentRepository;
import com.group6.gym.app.entities.Equipment;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    public List<Equipment> getAll() {
        return equipmentRepository.getAll();
    }

    @Override
    public Equipment findById(Long id) {
        return equipmentRepository.findById(id);
    }

    @Override
    public void guardar(Equipment equipment) {
        equipmentRepository.guardar(equipment);
    }

    @Override
    public void actualizar(Equipment equipment) {
        equipmentRepository.actualizar(equipment);
    }

    @Override
    public void eliminar(Long id) {
        equipmentRepository.eliminar(id);
    }
}
