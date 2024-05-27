package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.service.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceRepository extends JpaRepository<Service, Integer> {
}
