package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.service.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType, Integer> {
}
