package com.example.resortmanagementapp.service.impl;

import com.example.resortmanagementapp.model.employee.Account;
import com.example.resortmanagementapp.repository.IAccountRepository;
import com.example.resortmanagementapp.service.IAccountService;
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
