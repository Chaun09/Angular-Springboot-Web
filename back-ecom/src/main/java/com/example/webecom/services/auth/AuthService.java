package com.example.webecom.services.auth;

import com.example.webecom.dto.LoginRequest;
import com.example.webecom.dto.SignUpRequest;
import com.example.webecom.dto.UserDto;

public interface AuthService  {
    UserDto createCustomer(SignUpRequest signUpRequest);
    UserDto loginCustomer(LoginRequest loginRequest);
}
