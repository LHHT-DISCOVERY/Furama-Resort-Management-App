package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.employee.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRoleRepository extends JpaRepository<AccountRole,Long> {
}
