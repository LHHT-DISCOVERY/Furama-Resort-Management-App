package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division, Integer> {
}
