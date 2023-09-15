package com.example.furamaresortmanagementapp.service.impl;

import com.example.furamaresortmanagementapp.model.employee.Account;
import com.example.furamaresortmanagementapp.repository.IAccountRepository;
import com.example.furamaresortmanagementapp.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountRepository iAccountRepository;
    @Override
    public Account findAllByUsername(String username) {
        return iAccountRepository.findAccountByUserName(username);
    }
}
