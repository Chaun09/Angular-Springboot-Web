package com.example.webecom.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class LoginRequest {

    @NotBlank(message = "Password is required")
    private String password;
    @NotBlank(message = "Email is required")
    private String email;
}
