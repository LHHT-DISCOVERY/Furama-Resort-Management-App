package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {
}
