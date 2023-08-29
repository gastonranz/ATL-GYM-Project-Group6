package com.group6.gym.app.Service;

import com.group6.gym.app.Repository.EquipmentRepository;
import com.group6.gym.app.entities.Equipment;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Equipment> findById(Long id) {
        return equipmentRepository.findById(id);
    }

    @Override
    public Equipment guardar(Equipment equipment) {
        return equipmentRepository.guardar(equipment);
    }

    @Override
    public Equipment actualizar(Equipment equipment) {
        return equipmentRepository.actualizar(equipment);
    }

    @Override
    public void eliminar(Long id) {
        equipmentRepository.eliminar(id);
    }
}
