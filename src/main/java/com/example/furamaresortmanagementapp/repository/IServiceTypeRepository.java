package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.service.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceTypeRepository extends JpaRepository<ServiceType, Integer> {
}
