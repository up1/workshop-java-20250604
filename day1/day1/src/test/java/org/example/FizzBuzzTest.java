package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void case1() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.say(1));
    }

    @Test
    void case2() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("2", fb.say(2));
    }

    @Test
    void case3() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.say(3));
    }

    @Test
    void case4() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("4", fb.say(4));
    }

    @Test
    void case5() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.say(5));
    }

    @Test
    void case6() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.say(6));
    }

    @Test
    void case7() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.say(10));
    }

    @Test
    void case8() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.say(12));
    }

    @Test
    void case9() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.say(15));
    }

    @Test
    void case10() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.say(20));
    }

    @Test
    void case11() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("JAVA", fb.say(7));
    }
}