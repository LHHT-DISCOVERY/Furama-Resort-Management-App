package com.example.resortmanagementapp.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;


import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignupRequest {

    Integer bookId;
    String name;
    String gender;
    String dateOfBirth;
    String guardian;
    String address;
    String phone;
    @NotBlank
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "wrong format, should be abc@abc.com ")
    String email;
    @NotBlank
    @Length(min = 8, max = 32)
    String password;
}
