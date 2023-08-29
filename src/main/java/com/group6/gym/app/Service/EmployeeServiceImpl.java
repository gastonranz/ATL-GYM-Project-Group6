package com.group6.gym.app.Service;

import com.group6.gym.app.Repository.EmployeeRepository;
import com.group6.gym.app.entities.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public List<Employee> getEmployeeListWithGymAndWithMembership() {
        return employeeRepository.getEmployeeListWithGymAndWithMembership();
    }

    @Override
    public Optional<Employee> getEmployeeWithGymAndWithMembership(Long id) {
        return employeeRepository.findById(id);
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee guardar(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee actualizar(Employee employee) {
        return employeeRepository.save(employee);

    }

    public void eliminar(Long id) {
        employeeRepository.delete(findById(id).orElseThrow(RuntimeException::new));
    }


}
