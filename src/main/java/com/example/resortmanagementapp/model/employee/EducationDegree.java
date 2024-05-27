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
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int educationDegreeId;

    @NotNull(message = " Chứng chỉ không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String educationDegreeName;

    @OneToMany(mappedBy = "educationDegree")
    List<Employee> employees;

   
}
