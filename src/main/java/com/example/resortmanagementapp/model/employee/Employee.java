package com.example.resortmanagementapp.model.employee;

import com.example.resortmanagementapp.model.contract.Contract;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;
import java.util.Set;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmployeeId;

    @Column(columnDefinition = "varchar(45)")
    private String employeeName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date employeeBirthday;

    @NotNull(message = "Số chứng minh nhân dân không được để trống")
    private int employeeIdCard;

    @NotBlank(message = "Tiền lương không được để trống")
    @Min(value = 1, message = "Tiền lương phải là số  dương")
    private Double employeeSalary;

    @NotNull(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "^([0-9]{9})|([0-9]{12})$", message = "Số điện thoại phải đúng định dạng")
    @Column(columnDefinition = "varchar(45)")
    private int employeePhone;

    @NotNull(message = "Email không được để trống ")
    @Pattern(regexp = "^(?:^|\\s)[\\w!#$%&'*+/=?^`{|}~-](\\.?[\\w!#$%&'*+/=?^`{|}~-]+)*@\\w+[.-]?\\w*\\.[a-zA-Z]{2,3}\\b$", message = "Email phải đúng định dạng")
    @Column(columnDefinition = "varchar(45)")
    private String employeeEmail;

    @NotNull(message = "Địa chỉ không được để trống")
    @Column(columnDefinition = "varchar(45)")
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "account_name")
    private Account account;

    @OneToMany(mappedBy = "employee")
    private Set<Contract> contracts;

}
