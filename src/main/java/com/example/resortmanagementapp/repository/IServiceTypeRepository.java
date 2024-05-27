package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.service.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceTypeRepository extends JpaRepository<ServiceType, Integer> {
}
