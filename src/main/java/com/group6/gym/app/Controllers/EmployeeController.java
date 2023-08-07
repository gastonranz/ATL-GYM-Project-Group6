package com.group6.gym.app.Controllers;

import com.group6.gym.app.Entities.Employee;
import com.group6.gym.app.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping
    public List<Employee> getEmployee(){
        return employeeService.getAll();
    }

}
