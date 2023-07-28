package com.example.furamaresortmanagementapp.repository;

import com.example.furamaresortmanagementapp.model.employee.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account, String> {
}
