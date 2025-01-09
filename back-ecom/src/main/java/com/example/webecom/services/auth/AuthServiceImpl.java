package com.example.webecom.services.auth;
import com.example.webecom.dto.LoginRequest;
import com.example.webecom.dto.SignUpRequest;
import com.example.webecom.dto.UserDto;
import com.example.webecom.entity.User;
import com.example.webecom.enums.UserRole;
import com.example.webecom.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignUpRequest signUpRequest) {
        User user = new User();
        user.setName(signUpRequest.getName());
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(signUpRequest.getPassword());
        user.setAgain_password(signUpRequest.getAgain_password());
        user.setUserRole(UserRole.CUSTOMERS);
        UserDto userDto = new UserDto();
        User create = userRepository.save(user);
        userDto.setId(create.getId());
        return userDto;
    }

    public User findByEmail(LoginRequest loginRequest) {
        return userRepository.findByEmail(loginRequest.getEmail());
    }

    @Override
    public UserDto loginCustomer(LoginRequest loginRequest) {
        User user = findByEmail(loginRequest);
        if (loginRequest.getPassword().equals(user.getPassword())) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setEmail(user.getEmail());
            return userDto;
        }
        return null;

    }

}
