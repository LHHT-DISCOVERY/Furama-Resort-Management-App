package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.service.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType, Integer> {
}
