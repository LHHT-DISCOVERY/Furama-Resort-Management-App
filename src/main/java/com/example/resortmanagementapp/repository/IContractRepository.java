package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractRepository extends JpaRepository<Contract,Integer > {
}
