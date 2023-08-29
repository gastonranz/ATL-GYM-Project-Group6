package com.group6.gym.app.Service;

import com.group6.gym.app.entities.Gym;
import com.group6.gym.app.Repository.GymRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Gym> findById(Long id) {
        return gymRepository.findById(id);
    }

    @Override
    public Gym guardar(Gym obj) {
        return gymRepository.guardar(obj);
    }

    @Override
    public Gym actualizar(Gym obj) {
        return gymRepository.actualizar(obj);

    }

    @Override
    public void eliminar(Long id) {
        gymRepository.eliminar(id);

    }
}
