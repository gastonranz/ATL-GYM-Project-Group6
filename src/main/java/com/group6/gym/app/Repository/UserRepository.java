package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User findByID(Long id);

    void guardar(User user);

    void actualizar(User user);

    void eliminar(Long id);

}
