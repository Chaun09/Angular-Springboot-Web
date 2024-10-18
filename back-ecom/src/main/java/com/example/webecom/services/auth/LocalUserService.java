package com.example.webecom.services.auth;

import com.example.webecom.dto.UserDto;
import com.example.webecom.entity.LocalUser;
import com.example.webecom.repository.LocalUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocalUserService {
    private final LocalUserRepository localUserRepository;

    public ResponseEntity<?> sendEmail(UserDto userDto){
        LocalUser localUser = new LocalUser();
        localUser.setEmail(userDto.getEmail());
        localUserRepository.save(localUser);
        return ResponseEntity.ok("Gui email thanh cong");
    }



}
