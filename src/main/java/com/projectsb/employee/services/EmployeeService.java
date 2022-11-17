package com.projectsb.employee.services;

import com.projectsb.employee.modals.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee AddEmployee(Employee employee);
    public Optional<Employee> getEmployee(String id);
    public List<Employee> getAllEmployee();
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(String id);
}
