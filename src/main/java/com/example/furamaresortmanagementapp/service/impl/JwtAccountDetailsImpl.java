package com.example.furamaresortmanagementapp.service.impl;

import com.example.furamaresortmanagementapp.model.employee.Account;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class JwtAccountDetailsImpl implements UserDetails {
    private static final long serialVersionUID = 1L;
    private String username;

    private Boolean enable;

    @JsonIgnore
    private String password;
    private List<GrantedAuthority> grantedAuthorities = null;

    public JwtAccountDetailsImpl(String username, Boolean enable, String password, List<GrantedAuthority> grantedAuthorities) {
        this.username = username;
        this.enable = enable;
        this.password = password;
        this.grantedAuthorities = grantedAuthorities;
    }

    public static JwtAccountDetailsImpl build(Account account) {
        List<GrantedAuthority> authorities = account.getAccountRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getRole().getRoleName()))
                .collect(Collectors.toList());
        return new JwtAccountDetailsImpl(account.getAccountName(), account.getEnable(), account.getPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }


    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JwtAccountDetailsImpl account = (JwtAccountDetailsImpl) o;
        return Objects.equals(username, account.username);
    }

}
