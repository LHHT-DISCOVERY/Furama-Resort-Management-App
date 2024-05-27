package com.example.resortmanagementapp.repository;

import com.example.resortmanagementapp.model.employee.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role,Long > {
}
