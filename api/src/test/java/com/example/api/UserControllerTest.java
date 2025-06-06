package com.example.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("Success case")
    void case01() {
        UserResponse result
                = restTemplate.getForObject("/users/1", UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("Somkiat", result.getName());
        assertEquals("xx@xxx.com", result.getEmail());
    }

    @Test
    @DisplayName("400 Invalid input")
    void case02() {
        ErrorResponse result
                = restTemplate.getForObject("/users/xxx", ErrorResponse.class);
        assertEquals("Input Invalid", result.getMessage());
    }

    @Test
    @DisplayName("404 User not found with id=2")
    void case03() {
        ResponseEntity<ErrorResponse> result
                = restTemplate.getForEntity("/users/2", ErrorResponse.class);
        assertEquals(404, result.getStatusCode().value());
        assertEquals("User not found", result.getBody().getMessage());
    }
}