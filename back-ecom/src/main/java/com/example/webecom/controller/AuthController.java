package com.example.webecom.controller;
import com.example.webecom.dto.LoginRequest;
import com.example.webecom.dto.SignUpRequest;
import com.example.webecom.dto.UserDto;
import com.example.webecom.entity.ResponseMessage;
import com.example.webecom.services.auth.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/{api_prefix}")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@Valid @RequestBody SignUpRequest signUpRequest){
        UserDto createdCustomerDto = authService.createCustomer(signUpRequest);
        if(createdCustomerDto == null){
            return new ResponseEntity<>("Customer not create", HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(new ResponseMessage("Created Success"));
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginCustomer(@Valid @RequestBody LoginRequest loginRequest){
        UserDto loginCustomerDto = authService.loginCustomer(loginRequest);
        if(loginCustomerDto == null){
            return new ResponseEntity<>("Login Fail!", HttpStatus.UNAUTHORIZED);
        }
        return ResponseEntity.ok(new ResponseMessage("Login Success"));
    }













}
