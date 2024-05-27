package com.example.resortmanagementapp.service;

import com.example.resortmanagementapp.model.employee.Account;

public interface IAccountService {
    Account findAllByUsername(String username);
}
