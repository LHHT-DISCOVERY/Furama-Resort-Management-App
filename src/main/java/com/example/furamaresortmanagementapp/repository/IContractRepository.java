package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractRepository extends JpaRepository<Contract,Integer > {
}
