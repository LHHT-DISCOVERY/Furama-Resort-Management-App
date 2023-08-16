package com.example.furamaresortmanagementapp.model.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Account {
    @Id
    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String accountName;

    private Boolean enable;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String password;


    @OneToMany(mappedBy = "account")
    private Set<AccountRole> accountRoles;

    public Account() {
    }

    public Account(String accountName, Boolean enable, String password, Set<AccountRole> accountRoles) {
        this.accountName = accountName;
        this.enable = enable;
        this.password = password;
        this.accountRoles = accountRoles;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
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
