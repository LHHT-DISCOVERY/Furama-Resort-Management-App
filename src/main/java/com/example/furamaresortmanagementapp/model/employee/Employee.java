package com.example.furamaresortmanagementapp.model.employee;

import com.example.furamaresortmanagementapp.model.contract.Contract;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.Set;

@Entity
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

    public Employee(int employeeId, String employeeName, Date employeeBirthday, int employeeIdCard, Double employeeSalary, int employeePhone, String employeeEmail, String employeeAddress, Position position, EducationDegree educationDegree, Division division, Account account, Set<Contract> contracts) {
        EmployeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.account = account;
        this.contracts = contracts;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public int getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(int employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(int employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
