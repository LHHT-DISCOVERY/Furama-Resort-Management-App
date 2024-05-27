package com.example.resortmanagementapp.model.employee;


import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int positionId;

    @NotNull(message = "Vị trí không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String positionName;

    @OneToMany(mappedBy = "position")
    List<Employee> employees;
    
}
