package com.example.webecom.dto;


import com.example.webecom.enums.UserRole;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;



@Valid
@Data
@RequiredArgsConstructor
@Getter



public class UserDto {
    private Long id;
    //@NotEmpty(message = "ko dc de trong")
    private String username;
    @Email(message = "Sai kieu email")
    private String email;
    private UserRole userRole;
}
