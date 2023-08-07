package com.group6.gym.app.Service;

import com.group6.gym.app.Entities.Employee;
import com.group6.gym.app.Repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeService;

    public List<Employee> getAll(){
        return (List<Employee>) employeeService.findAll();
    }
     public Employee findById(Long id){
        return employeeService.findById(id).get();
     }
     public void guardar(Employee employee){
        employeeService.save(employee);
     }
     public void actualizar(Employee employee){
        employeeService.save(employee);

     }
     public void eliminar(Long id){
        employeeService.delete(findById(id));
     }


}
