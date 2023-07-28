package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position, Integer> {
}
