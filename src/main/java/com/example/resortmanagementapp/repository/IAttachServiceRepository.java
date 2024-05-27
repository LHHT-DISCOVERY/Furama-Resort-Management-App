package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.contract.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAttachServiceRepository extends JpaRepository<AttachService, Integer > {
}
