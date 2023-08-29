package com.group6.gym.app.Service;

import com.group6.gym.app.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();

    Optional<User> findById(Long id);

    User guardar(User user);

    User actualizar(User user);

    void eliminar(Long id);
}
