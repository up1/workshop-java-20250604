package org.example.dip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LabelGenerationTest {

    @Test
    @DisplayName("Random with 5")
    void case01() {
        Random random = new Random(){
            @Override
            public int nextInt(int bound) {
                return 5;
            }
        };
        LabelGeneration lg = new LabelGeneration();
        lg.random = random; // Dependency Injection (DI)
        String result = lg.create("ABC");
        assertEquals("ABC-5", result);
    }

    @Test
    @DisplayName("Random with 50")
    void case02() {
        Random random = new Random(){
            @Override
            public int nextInt(int bound) {
                return 50;
            }
        };
        LabelGeneration lg = new LabelGeneration();
        lg.random = random; // Dependency Injection (DI)
        String result = lg.create("ABC");
        assertEquals("Error", result);
    }
}