package com.example.furamaresortmanagementapp.service.impl;

import com.example.furamaresortmanagementapp.model.employee.Account;
import com.example.furamaresortmanagementapp.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtAccountDetailServiceImpl implements UserDetailsService {
    @Autowired
    private IAccountRepository iAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepository.findAllByUsername(username);
        if (account == null){
            throw new UsernameNotFoundException("User " + username + " Was not found in database");
        }
        return JwtAccountDetailsImpl.build(account);
    }
}
