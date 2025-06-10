package com.example.api;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import static jakarta.transaction.Transactional.TxType.REQUIRES_NEW;

@Service
public class UserService2 {

    private final UserRepository userRepository;

    public UserService2(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Transactional(REQUIRES_NEW)
    public UserResponse xyz(UserRequest request) {
        MyUser newUser = new MyUser();
        newUser.setId(1); // Manual
        newUser.setName(request.getName());
        newUser.setEmail(request.getEmail());
        newUser = userRepository.save(newUser);

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
