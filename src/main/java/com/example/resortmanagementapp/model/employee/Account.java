package com.example.resortmanagementapp.model.employee;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {
    @Id
    @Column(columnDefinition = "varchar(45)", nullable = false)
    String accountName;

    Boolean enable;

    @Column(nullable = false)
    String password;


    @OneToMany(mappedBy = "account")
    Set<AccountRole> accountRoles;

}
