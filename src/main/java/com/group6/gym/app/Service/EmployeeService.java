package com.group6.gym.app.Service;

import com.group6.gym.app.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    Employee findById(Long id);

    void guardar(Employee employee);

    void actualizar(Employee employee);

    void eliminar(Long id);
}
