package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer > {
}
