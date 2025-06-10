package com.example.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void case01(){
        MyUser u1 = new MyUser();
        u1.setId(1);
        u1.setName("Demo test");
        u1.setEmail("Demo email");
        userRepository.save(u1);

        Optional<MyUser> result =  userRepository.findById(1);
        assertTrue(result.isPresent());
        assertEquals("Demo test", result.get().getName());
        assertEquals("Demo email", result.get().getEmail());

        userRepository.findByNameAndEmail("", "");
    }

}