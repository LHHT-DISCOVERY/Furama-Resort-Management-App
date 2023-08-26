package com.example.furamaresortmanagementapp.model.employee;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int divisionId;

    @NotNull(message = "Vị trí không được để trống")
    @Column(columnDefinition = "Varchar(45)")
    private String positionName;

    @OneToMany(mappedBy = "division")
    private List<Employee> employees;

    public Division() {
    }

    public Division(int divisionId, String positionName, List<Employee> employees) {
        this.divisionId = divisionId;
        this.positionName = positionName;
        this.employees = employees;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
