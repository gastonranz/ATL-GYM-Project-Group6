package com.group6.gym.app.Repository;
import com.group6.gym.app.Entities.Gym;

import java.util.List;

public interface GymRepository {
    List<Gym> getAll();

    Gym findById(Long id);

    void guardar(Gym gym);

    void actualizar(Gym gym);

    void eliminar(Long id);


}