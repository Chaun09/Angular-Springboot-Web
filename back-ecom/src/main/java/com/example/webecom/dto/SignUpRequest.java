package com.example.webecom.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class SignUpRequest {
    @NotBlank(message = "Username is required")
    private String name;
    @NotBlank(message = "Password is required")
    private String password;
//    @NotBlank(message = "Password is required")
    private String again_password;
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    private String email;
}
