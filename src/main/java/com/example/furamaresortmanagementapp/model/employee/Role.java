package com.example.furamaresortmanagementapp.model.employee;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    @NotNull
    private String roleName;

    @OneToMany(mappedBy = "role")
    private Set<AccountRole> accountRoles;

    public Role() {
    }

    public Role(Long roleId, String roleName, Set<AccountRole> accountRoles) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.accountRoles = accountRoles;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<AccountRole> getAccountRoles() {
        return accountRoles;
    }

    public void setAccountRoles(Set<AccountRole> accountRoles) {
        this.accountRoles = accountRoles;
    }
}
