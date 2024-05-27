package com.example.resortmanagementapp.model.customer;

import com.example.resortmanagementapp.model.contract.Contract;
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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;

    @NotNull(message = "Họ và tên khách hàng không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String customerName;

    @NotNull(message = "Ngày sinh không được để trống")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date customerBirthday;

    @NotNull(message = "Giới tính không được dể trống")
    Boolean customerGender;

    @NotNull(message = "Số CCCD không được bỏ trống")
    @Column(columnDefinition = "varchar(45)")
    String customerIdCard;

    @NotNull(message = "Số điện thoại không được bỏ trống")
    @Column(columnDefinition = "varchar(45)")
    String customerPhone;

    @NotNull(message = "Email không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String customerEmail;

    @NotNull(message = "Địa chỉ khách hàng không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    Set<Contract> contract;

}
