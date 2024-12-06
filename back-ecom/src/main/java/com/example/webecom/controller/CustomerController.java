package com.example.webecom.controller;
import com.example.webecom.dto.UserDto;
import com.example.webecom.services.auth.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/{api_prefix}/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;


    @GetMapping("/show-all")
    public ResponseEntity<?> showAllCustomer(){
        return customerService.showAllCustomer();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> showCustomer(@PathVariable Long id){
        return customerService.showCustomerById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomerById(@PathVariable Long id){
        customerService.deleteCustomerById(id);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable Long id, @RequestBody @Valid UserDto userDto){
        return customerService.updateCustomer(id,userDto);
    }

}
