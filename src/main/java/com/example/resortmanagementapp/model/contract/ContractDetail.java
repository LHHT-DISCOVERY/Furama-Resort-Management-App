package com.example.resortmanagementapp.model.contract;


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
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int contractDetailId;

    @NotNull(message = "Số lượng không được để trống")
    int quantity;

    @ManyToOne
    @JoinColumn(name = "attach_service_id")
    AttachService attachService ;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    Contract contract;

}
