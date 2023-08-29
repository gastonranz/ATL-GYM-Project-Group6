package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<User> getAll();

    Optional<User> findById(Long id);

    User guardar(User user);

    User actualizar(User user);

    void eliminar(Long id);

}
