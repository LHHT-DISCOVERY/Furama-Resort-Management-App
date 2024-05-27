package com.example.resortmanagementapp.model.contract;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.Set;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int attachServiceId;

    @NotNull(message = "Tên dịch vụ đính kèm không được để trống")
    @Column(columnDefinition = "varchar(45)")
    int attachServiceName;

    @NotNull(message = "Chi phí dịch vụ không được bỏ trống")
    Double attachServiceCost;

    int attachServiceUnit;

    @NotBlank(message = "trạng thái của dịch vụ đi kèm không được bỏ trống")
    @Column(columnDefinition = "varchar(45)")
    String attachServiceStatus;

    @OneToMany(mappedBy = "attachService")
    Set<ContractDetail> contractDetails;

}
