package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
