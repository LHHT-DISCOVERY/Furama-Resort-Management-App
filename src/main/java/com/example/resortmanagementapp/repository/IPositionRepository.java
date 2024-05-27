package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position, Integer> {
}
