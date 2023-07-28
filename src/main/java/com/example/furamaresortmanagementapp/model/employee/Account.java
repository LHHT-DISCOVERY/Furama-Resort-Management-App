package com.example.furamaresortmanagementapp.model.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
public class Account {
    @Id
    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String accountName;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String password;


    @OneToMany(mappedBy = "account")
    private Set<AccountRole> accountRoles;

    public Account() {
    }

    public Account(String accountName, String password, Set<AccountRole> accountRoles) {
        this.accountName = accountName;
        this.password = password;
        this.accountRoles = accountRoles;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<AccountRole> getAccountRoles() {
        return accountRoles;
    }

    public void setAccountRoles(Set<AccountRole> accountRoles) {
        this.accountRoles = accountRoles;
    }
}
