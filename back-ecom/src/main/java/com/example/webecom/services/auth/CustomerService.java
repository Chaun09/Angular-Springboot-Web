package com.example.webecom.services.auth;

import com.example.webecom.dto.UserDto;
import com.example.webecom.entity.User;
import com.example.webecom.repository.ProductRepository;
import com.example.webecom.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final UserRepository userRepository;

    public ResponseEntity<?> showAllCustomer(){
        List<User> users = userRepository.findAll();
        if(users.isEmpty())
            return new ResponseEntity<>("No Product Found", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(users);
    }

    public ResponseEntity<?> showCustomerById(Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty())
            return new ResponseEntity<>("No Person Found", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(user);
    }

    public void deleteCustomerById(Long id){
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(userRepository::delete);

    }

    public ResponseEntity<?> updateCustomer(Long id, UserDto userDto) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty())
            return new ResponseEntity<>("No Person Found", HttpStatus.NOT_FOUND);
        user.get().setEmail(userDto.getEmail());
        user.get().setUserRole(userDto.getUserRole());
        user.get().setName(userDto.getUsername());
        userRepository.save(user.get());
        return new ResponseEntity<>("Update success", HttpStatus.OK);
    }
}
