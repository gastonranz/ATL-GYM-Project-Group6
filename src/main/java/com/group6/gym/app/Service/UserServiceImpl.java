package com.group6.gym.app.Service;

import com.group6.gym.app.entities.User;
import com.group6.gym.app.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<User> findById(Long id) {
        return userService.findById(id);
    }

    @Override
    public User guardar(User user) {
        return userService.guardar(user);
    }

    @Override
    public User actualizar(User user) {
        return userService.actualizar(user);

    }

    @Override
    public void eliminar(Long id) {
        userService.eliminar(id);
    }
}
