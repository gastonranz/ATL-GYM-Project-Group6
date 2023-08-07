package com.group6.gym.app.Service;

import com.group6.gym.app.Entities.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User findByID (Long id);
    void guardar(User user);
    void actualizar(User user);
    void eliminar(Long id);
}
