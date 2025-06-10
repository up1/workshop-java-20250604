package com.example.api;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse register(UserRequest request) {
        MyUser newUser = new MyUser();
        newUser.setId(1); // Manual
        newUser.setName(request.getName());
        newUser.setEmail(request.getEmail());
        newUser = userRepository.save(newUser);

        UserResponse userResponse = new UserResponse();
        userResponse.setId(newUser.getId());
        userResponse.setName(newUser.getName());
        userResponse.setEmail(newUser.getEmail());
        return  userResponse;
    }
}
