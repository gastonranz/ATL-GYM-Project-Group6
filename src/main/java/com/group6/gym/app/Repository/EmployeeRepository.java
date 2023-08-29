package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e JOIN FETCH e.gym g JOIN FETCH e.membership")
    List<Employee> getEmployeeListWithGymAndWithMembership();

    @Query("SELECT e FROM Employee e JOIN FETCH e.gym g JOIN FETCH e.membership WHERE e.id = ?1")
    Optional<Employee> getEmployeeWithGymAndWithMembership(Long id);
}
