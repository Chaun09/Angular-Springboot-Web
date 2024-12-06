package com.example.webecom.services.auth;



import com.example.webecom.dto.LocalUserDto;
import com.example.webecom.entity.LocalUser;
import com.example.webecom.entity.ResponseMessage;
import com.example.webecom.repository.LocalUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LocalUserService {
    private final LocalUserRepository localUserRepository;

    public ResponseEntity<?> sendEmail(LocalUserDto localUserDto){
        LocalUser localUser = new LocalUser();
        localUser.setEmail(localUserDto.getEmail());
        localUser.setName(localUserDto.getName());
        localUser.setMessage(localUserDto.getMessage());
        localUserRepository.save(localUser);
        return ResponseEntity.ok(new ResponseMessage("Gui thanh cong"));
    }



}
