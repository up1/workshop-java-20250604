package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable int id) {
        UserResponse response = new UserResponse();
        response.setId(id);
        response.setName("Somkiat");
        response.setEmail("xx@xxx.com");
        return response;
    }

}
