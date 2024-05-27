package com.example.resortmanagementapp.model.customer;



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
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerTypeId;

    @NotNull(message = "Tên loại khách hàng không được để trống")
    @Column(columnDefinition = "varchar(45)")
    String customerTypeName;

    @OneToMany(mappedBy = "customerType")
    Set<Customer>  customers;

  
}

