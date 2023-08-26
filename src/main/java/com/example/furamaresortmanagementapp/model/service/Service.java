package com.example.furamaresortmanagementapp.model.service;

import com.example.furamaresortmanagementapp.model.contract.Contract;
import javax.persistence.*;
import javax.validation.constraints.*;

import java.util.Set;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ServiceId;

    @NotBlank(message = "Tên dịch vụ không được bỏ trống")
    @Column(columnDefinition = "varchar(45)")
    private String serviceName;

    @NotNull(message = "Diện tích không được bỏ trống")
    private int serviceArea;

    @NotNull(message = "Chi phí dịch vụ không được để trống")
    private int serviceCost;

    @NotNull(message = "Số người tối đa của dịch vụ không được bỏ trống")
    private int serviceMaxPeople;

    @NotNull(message = "Tiêu chuẩn phòng không được để trống")
    @Column(columnDefinition = "varchar(45)")
    private String standardRoom;

    @NotNull(message = "Mô tả các tiện nghi khác không được để trống")
    @Column(columnDefinition = "varchar(45)")
    private String descriptionOtherConvenience;

    @NotNull(message = "Diện tích hồ bơi không được để trống")
    private Double poolArea;

    @NotNull(message = "Số tầng không được để trống")
    private int numberOfFloors;

    @ManyToOne
    @JoinColumn(name = "rent_type_id")
    private RentType rentType;

    @OneToMany(mappedBy = "service")
    private Set<Contract>  contracts ;

    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType ;

    public Service() {
    }

    public Service(int serviceId, String serviceName, int serviceArea, int serviceCost, int serviceMaxPeople, String standardRoom, String descriptionOtherConvenience, Double poolArea, int numberOfFloors, RentType rentType, Set<Contract> contracts, ServiceType serviceType) {
        ServiceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.rentType = rentType;
        this.contracts = contracts;
        this.serviceType = serviceType;
    }

    public int getServiceId() {
        return ServiceId;
    }

    public void setServiceId(int serviceId) {
        ServiceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int serviceArea) {
        this.serviceArea = serviceArea;
    }

    public int getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
