package com.example.webecom.controller;

import com.example.webecom.dto.LocalUserDto;
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
@RequestMapping("/{api_prefix}/local-user")
@RequiredArgsConstructor
public class LocalUserController {
    private final LocalUserService localUserService;
    @PostMapping("/send-email")
    public ResponseEntity<?> sendEmail(@RequestBody LocalUserDto localUserDto){
        return localUserService.sendEmail(localUserDto);
    }

//    @GetMapping("/get-email")
//    public ResponseEntity<?> getEmail(){
//        List<LocalUser> localUser = localUserRepository.findAll();
//        if(localUser.isEmpty()){
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(localUser);
//    }
//    @GetMapping("/get-by-id/{id}")
//    public ResponseEntity<?> getEmailById(@PathVariable Long id){
//        Optional<LocalUser> localUser = localUserRepository.findById(id);
//        if(localUser.isEmpty()){
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(localUser.get().getEmail());
//    }


}
