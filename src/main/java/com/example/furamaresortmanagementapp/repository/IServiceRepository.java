package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.service.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceRepository extends JpaRepository<Service, Integer> {
}
