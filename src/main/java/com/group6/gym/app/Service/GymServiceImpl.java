package com.group6.gym.app.Service;

import com.group6.gym.app.entities.Gym;
import com.group6.gym.app.Repository.GymRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GymServiceImpl implements GymService {
    @Autowired
    private GymRepository gymRepository;

    @Override
    public List<Gym> getAll() {
        return gymRepository.getAll();
    }

    @Override
    public Gym findById(Long id) {
        return gymRepository.findById(id);
    }

    @Override
    public void guardar(Gym obj) {
        gymRepository.guardar(obj);

    }

    @Override
    public void actualizar(Gym obj) {
        gymRepository.actualizar(obj);

    }

    @Override
    public void eliminar(Long id) {
        gymRepository.eliminar(id);

    }
}
