package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer > {
}
