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
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int divisionId;

    @NotNull(message = "Vị trí không được để trống")
    @Column(columnDefinition = "Varchar(45)")
    String positionName;

    @OneToMany(mappedBy = "division")
    List<Employee> employees;
}
