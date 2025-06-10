package com.example.api;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserRepository userRepository;

    @PostMapping("/users")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request) {
        System.out.println(request);

        // TODO :: Create data in database



        UserResponse userResponse = new UserResponse();
        userResponse.setName(request.getName());
        userResponse.setEmail(request.getEmail());

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
