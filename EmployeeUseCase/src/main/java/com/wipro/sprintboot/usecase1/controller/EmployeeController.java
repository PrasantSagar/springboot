package com.wipro.sprintboot.usecase1.controller;

import com.wipro.sprintboot.usecase1.model.Employee;
import com.wipro.sprintboot.usecase1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(@RequestParam String name, @RequestParam String designation) {
        employeeService.addEmployee(name, designation);
        return "Employee added successfully!";
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
