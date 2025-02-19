package com.wipro.sprintboot.usecase1.service;

import com.wipro.sprintboot.usecase1.model.Employee;
import com.wipro.sprintboot.usecase1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(String name, String designation) {
        String role = switch (designation.toLowerCase()) {
            case "developer" -> "Developer";
            case "tester" -> "Tester";
            case "architect" -> "Architect";
            default -> "Unknown Role";
        };

        Employee employee = new Employee(name, role);
        employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployee(int id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
