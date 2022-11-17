package com.projectsb.employee.servicesimpl;

import com.projectsb.employee.exception.UserNotFoundException;
import com.projectsb.employee.modals.Employee;
import com.projectsb.employee.repository.EmployeeRepository;
import com.projectsb.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee AddEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployee(String id) {
        return Optional.ofNullable(employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("Used " + id + " Not found !")));
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
