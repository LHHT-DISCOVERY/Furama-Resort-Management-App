package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
