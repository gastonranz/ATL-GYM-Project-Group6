package com.group6.gym.app.Controllers;

import com.group6.gym.app.Entities.User;
import com.group6.gym.app.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
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
    @PostMapping("/{id}")
    public void saveUser(@RequestBody User user){
        userService.guardar(user);
    }
    @PutMapping("/{id}")
    public void actualizarUser(@PathVariable ("id")Long id,@RequestBody User user){
        userService.actualizar(user);
    }
    @DeleteMapping("/{id}")
    public void eliminarUser(@PathVariable ("id")Long id){
        userService.eliminar(id);
    }
}
