package com.example.resortmanagementapp.model.contract;

import com.example.resortmanagementapp.model.customer.Customer;
import com.example.resortmanagementapp.model.employee.Employee;
import com.example.resortmanagementapp.model.service.Service;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Set;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int contractId;

    @NotNull(message = "Ngày bắt đầu hợp đồng không được để trống")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date contractStartDate;

    @NotNull(message = "Ngày kết thúc hợp đồng không được để trống")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date contractEndDate;

    @NotNull(message = "Tiền đặt cọc không được để trống")
    Double contractDeposit;

    @NotNull(message = "Tổng tiền không được để trống")
    Double contractTotalMoney;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "service_id")
    Service service;

    @OneToMany(mappedBy = "contract")
    Set<ContractDetail> contractDetails;

}
