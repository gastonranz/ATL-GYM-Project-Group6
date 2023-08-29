package com.group6.gym.app.Controllers;

import com.group6.gym.app.entities.User;
import com.group6.gym.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User>getUser(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id")Long id){
        return userService.findByID(id);
    }

    @PostMapping
    public void saveUser(@RequestBody User user){
        userService.guardar(user);
    }

    @PutMapping("/{id}")
    public void actualizarUser(@PathVariable ("id")Long id,@RequestBody User user){
        user.setId(id);
        userService.actualizar(user);
    }

    @DeleteMapping("/{id}")
    public void eliminarUser(@PathVariable ("id")Long id){
        userService.eliminar(id);
    }
}
