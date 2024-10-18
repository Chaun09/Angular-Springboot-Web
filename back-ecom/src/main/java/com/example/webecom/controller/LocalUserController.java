package com.example.webecom.controller;

import com.example.webecom.dto.UserDto;
import com.example.webecom.entity.LocalUser;
import com.example.webecom.repository.LocalUserRepository;
import com.example.webecom.services.auth.LocalUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/{api_prefix}")
@RequiredArgsConstructor
public class LocalUserController {
    private final LocalUserService localUserService;
    private final LocalUserRepository localUserRepository;
    @PostMapping("/send_email")
    public ResponseEntity<?> sendEmail(@RequestBody UserDto userDto){
        return localUserService.sendEmail(userDto);
    }
    @GetMapping("/get_email")
    public ResponseEntity<?> getEmail(){
        List<LocalUser> localUser = localUserRepository.findAll();
        if(localUser.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(localUser);
    }
    @GetMapping("/get_email_by_id/{id}")
    public ResponseEntity<?> getEmailById(@PathVariable Long id){
        Optional<LocalUser> localUser = localUserRepository.findById(id);
        if(localUser.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(localUser.get().getEmail());
    }


}
