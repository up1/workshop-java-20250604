package com.example.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/users")
    public ResponseEntity<UserResponse> createUser(
            @Valid @RequestBody UserRequest request) {
        System.out.println(request);


        // TODO :: Create data in database
        MyUser newUser = new MyUser();
        newUser.setId(1); // Manual
        newUser.setName(request.getName());
        newUser.setEmail(request.getEmail());
        newUser = userRepository.save(newUser);

        UserResponse userResponse = new UserResponse();
        userResponse.setId(newUser.getId());
        userResponse.setName(newUser.getName());
        userResponse.setEmail(newUser.getEmail());

        ResponseEntity<UserResponse> response = new ResponseEntity<>(userResponse, HttpStatusCode.valueOf(201));
        return response;
    }


    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable int id) {
        if (id == 2) {
            throw new UserNotFoundException("User not found");
        }
        UserResponse response = new UserResponse();
        response.setId(id);
        response.setName("Somkiat");
        response.setEmail("xx@xxx.com");
        return response;
    }

}
