package com.example.api;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserService2 service2;

    public UserService(UserRepository userRepository, UserService2 service2) {
        this.userRepository = userRepository;
        this.service2 = service2;
    }

    @Transactional(rollbackOn = RuntimeException.class)
    public UserResponse register(UserRequest request) {
        MyUser newUser = new MyUser();
        newUser.setId(1); // Manual
        newUser.setName(request.getName());
        newUser.setEmail(request.getEmail());
        newUser = userRepository.save(newUser);
        userRepository.save(newUser);
        service2.xyz(request);
        // Don't
        // Send email
        // Call external service

        UserResponse userResponse = new UserResponse();
        userResponse.setId(newUser.getId());
        userResponse.setName(newUser.getName());
        userResponse.setEmail(newUser.getEmail());
        return  userResponse;
    }
}
