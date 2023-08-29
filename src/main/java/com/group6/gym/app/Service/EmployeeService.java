package com.group6.gym.app.Service;

import com.group6.gym.app.entities.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAll();

    List<Employee> getEmployeeListWithGymAndWithMembership();

    Optional<Employee> getEmployeeWithGymAndWithMembership(Long id);

    Optional<Employee> findById(Long id);

    Employee guardar(Employee employee);

    Employee actualizar(Employee employee);

    void eliminar(Long id);
}
