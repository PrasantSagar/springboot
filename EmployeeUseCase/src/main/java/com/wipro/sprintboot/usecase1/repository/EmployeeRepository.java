package com.wipro.sprintboot.usecase1.repository;

import com.wipro.sprintboot.usecase1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
