package com.example.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<UserResponse> createUser(
            @Valid @RequestBody UserRequest request) {
        System.out.println(request);

        UserResponse userResponse = userService.register(request);
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
