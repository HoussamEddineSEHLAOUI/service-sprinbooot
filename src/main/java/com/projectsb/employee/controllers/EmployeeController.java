package com.projectsb.employee.controllers;
import com.projectsb.employee.modals.Employee;
import com.projectsb.employee.servicesimpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeServiceImpl employeeService;
    @Autowired
    public EmployeeController(EmployeeServiceImpl employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees = employeeService.getAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

   /* @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id){
        Optional<Employee> employee = employeeService.getEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }*/

    @PostMapping("/add")
    public ResponseEntity<Employee> AddEmployee(@RequestBody Employee employee){
        Employee employeeResp = employeeService.AddEmployee(employee);
        return new ResponseEntity<>(employeeResp, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee employeeResp = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(employeeResp, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") String id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
