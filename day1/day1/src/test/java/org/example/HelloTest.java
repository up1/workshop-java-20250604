package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void sayHi() {
        Hello h = new Hello();
        String result = h.sayHi("SOMKIAT");
        assertEquals("Hi, somkiat", result);
    }

    @Test
    void sayHi2() {
        Hello h = new Hello();
        String result = h.sayHi("somKiat");
        assertEquals("Hi, somkiat", result);
    }
}