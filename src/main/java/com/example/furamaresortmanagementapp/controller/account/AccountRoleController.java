package com.example.furamaresortmanagementapp.controller.account;

import com.example.furamaresortmanagementapp.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AccountRoleController {
    @Autowired
    private IAccountService iAccountService;

}
