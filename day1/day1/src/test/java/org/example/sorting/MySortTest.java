package org.example.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    void case01() {
        MySort mySort = new MySort();
        List<Integer> input = List.of();
        List<Integer> expected = List.of();
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    void case02() {
        MySort mySort = new MySort();
        List<Integer> input = List.of(1);
        List<Integer> expected = List.of(1);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    void case03() {
        MySort mySort = new MySort();
        List<Integer> input = List.of(1,2);
        List<Integer> expected = List.of(1,2);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    void case04() {
        MySort mySort = new MySort();
        List<Integer> input = List.of(2,1);
        List<Integer> expected = List.of(1,2);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    void case05() {
        MySort mySort = new MySort();
        List<Integer> input = List.of(1,2,3);
        List<Integer> expected = List.of(1,2,3);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    void case06() {
        MySort mySort = new MySort();
        List<Integer> input = List.of(2,1,3);
        List<Integer> expected = List.of(1,2,3);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    void case07() {
        MySort mySort = new MySort();
        List<Integer> input = List.of(1,3,2);
        List<Integer> expected = List.of(1,2,3);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    void case08() {
        MySort mySort = new MySort();
        List<Integer> input = List.of(3,2,1);
        List<Integer> expected = List.of(1,2,3);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }

    @Test
    void case09() {
        MySort mySort = new MySort();
        List<Integer> input = List.of(3,2,1,8,10,4,1);
        List<Integer> expected = List.of(1,2,3);
        List<Integer> result = mySort.sort(input);
        assertEquals(expected, result);
    }
}