package com.group6.gym.app.Service;

import com.group6.gym.app.Entities.Gym;

import java.util.List;

public interface GymService {
    List<Gym> getAll();

    Gym findById(Long id);

    void guardar(Gym obj);

    void actualizar(Gym obj);

    void eliminar(Long id);
}
