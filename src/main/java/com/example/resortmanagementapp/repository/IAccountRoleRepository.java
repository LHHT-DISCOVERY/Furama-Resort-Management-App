package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.employee.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRoleRepository extends JpaRepository<AccountRole,Long> {
}
