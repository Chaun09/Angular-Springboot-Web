package com.example.webecom.dto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Valid
@Data
@RequiredArgsConstructor
@Getter
public class LocalUserDto {
    private String name;
    @Email(message = "Sai kieu email")
    private String email;
    private String message;
}
