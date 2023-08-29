package com.group6.gym.app.Service;

import com.group6.gym.app.entities.Gym;

import java.util.List;
import java.util.Optional;

public interface GymService {
    List<Gym> getAll();

    Optional<Gym> findById(Long id);

    Gym guardar(Gym obj);

    Gym actualizar(Gym obj);

    void eliminar(Long id);
}
