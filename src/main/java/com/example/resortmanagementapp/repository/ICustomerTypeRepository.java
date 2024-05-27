package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
