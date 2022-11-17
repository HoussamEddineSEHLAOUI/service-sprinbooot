package com.projectsb.employee.repository;

import com.projectsb.employee.modals.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    void deleteEmployeeById(String id);
    Optional<Employee> findEmployeeById(String id);
}
