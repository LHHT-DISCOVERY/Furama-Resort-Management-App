package com.example.resortmanagementapp.model.service;

import java.util.Set;

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
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int serviceTypeId;

    @NotNull(message = "Không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String serviceTypeName;

    @OneToMany(mappedBy = "serviceType")
    Set<Service>  services;

}
