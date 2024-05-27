package com.example.resortmanagementapp.model.service;

import com.example.resortmanagementapp.model.contract.Contract;


import java.util.Set;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ServiceId;

    @NotBlank(message = "Tên dịch vụ không được bỏ trống")
    @Column(columnDefinition = "varchar(45)")
    String serviceName;

    @NotNull(message = "Diện tích không được bỏ trống")
    int serviceArea;

    @NotNull(message = "Chi phí dịch vụ không được để trống")
    int serviceCost;

    @NotNull(message = "Số người tối đa của dịch vụ không được bỏ trống")
    int serviceMaxPeople;

    @NotNull(message = "Tiêu chuẩn phòng không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String standardRoom;

    @NotNull(message = "Mô tả các tiện nghi khác không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String descriptionOtherConvenience;

    @NotNull(message = "Diện tích hồ bơi không được để trống")
    Double poolArea;

    @NotNull(message = "Số tầng không được để trống")
    int numberOfFloors;

    @ManyToOne
    @JoinColumn(name = "rent_type_id")
    RentType rentType;

    @OneToMany(mappedBy = "service")
    Set<Contract>  contracts ;

    @ManyToOne
    @JoinColumn(name = "service_type_id")
    ServiceType serviceType ;

}
