package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {

    @Test
    @DisplayName("[1,5]  => 1,2,3,4,5")
    public void case05(){
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.getResult();
        assertEquals("1,2,3,4,5", result);
    }

    @Test
    @DisplayName("(1,5]  => 2,3,4,5")
    public void case06(){
        MyRange myRange = new MyRange("(1,5]");
        String result = myRange.getResult();
        assertEquals("2,3,4,5", result);
    }

    @Test
    @DisplayName("[1  => 1")
    public void case03(){
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1, result);
    }

    @Test
    @DisplayName("(1  => 2")
    public void case04(){
        MyRange myRange = new MyRange("(1,5]");
        int result = myRange.getStart();
        assertEquals(2, result);
    }

    @Test
    @DisplayName("input เริ่มต้นด้วย [ หรือไม่")
    public void case01(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.startWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("input เริ่มต้นด้วย ( หรือไม่")
    public void case02(){
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.startWithInclude();
        assertFalse(result);
    }

}