package com.teste.testejunit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxMinTest {

    @Test
    void testClass() {
        MaxMin mm1 = new MaxMin();
    }

    @Test
    void test0() {
        int [] val = {};

        assertThrows(IllegalArgumentException.class, ()->MaxMin.maxmin(val));
    }

    @Test
    void test1() {
        int [] val = {1, 3, 6, 5, -2, 10, 4, 8};
        int [] expected = {10, -2};

        assertEquals(Arrays.toString(expected), Arrays.toString(MaxMin.maxmin(val)));
    }
}
