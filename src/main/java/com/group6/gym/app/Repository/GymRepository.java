package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.Gym;

import java.util.List;
import java.util.Optional;

public interface GymRepository {
    List<Gym> getAll();

    Optional<Gym> findById(Long id);

    Gym guardar(Gym gym);

    Gym actualizar(Gym gym);

    void eliminar(Long id);


}