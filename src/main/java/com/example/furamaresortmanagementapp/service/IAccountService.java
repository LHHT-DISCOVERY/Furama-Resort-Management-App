package com.example.furamaresortmanagementapp.service;

import com.example.furamaresortmanagementapp.model.employee.Account;

public interface IAccountService {
    Account findAllByUsername(String username) ;
}
