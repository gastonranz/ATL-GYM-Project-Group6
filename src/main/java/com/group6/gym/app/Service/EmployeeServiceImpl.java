package com.group6.gym.app.Service;

import com.group6.gym.app.Repository.EmployeeRepository;
import com.group6.gym.app.entities.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    public void guardar(Employee employee) {
        employeeRepository.save(employee);
    }

    public void actualizar(Employee employee) {
        employeeRepository.save(employee);

    }

    public void eliminar(Long id) {
        employeeRepository.delete(findById(id));
    }


}
