package com.group6.gym.app.Service;

import com.group6.gym.app.entities.User;
import com.group6.gym.app.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userService;

    @Override
    public List<User> getAll() {
        return userService.getAll();
    }

    @Override
    public User findByID(Long id) {
        return userService.findByID(id);
    }

    @Override
    public void guardar(User user) {
        userService.guardar(user);

    }

    @Override
    public void actualizar(User user) {
        userService.actualizar(user);

    }

    @Override
    public void eliminar(Long id) {
        userService.eliminar(id);
    }
}
