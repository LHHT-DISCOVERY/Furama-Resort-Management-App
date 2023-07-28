package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.employee.Division;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division, Integer> {
}
