package com.teste.testejunit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EquationTest {
    @Test
    void testClass() {
        Equation e1 = new Equation();
    }
    @Test
    void test0() {
        int a = 0, b = 3, c = 5;
        assertThrows(IllegalArgumentException.class, ()->Equation.getRoots(a, b, c));
    }
    @Test
    void test1() {
        int a = 1, b = -1, c = -12;
        double [] expected = {4, -3};

        assertEquals(Arrays.toString(expected), Arrays.toString(Equation.getRoots(a, b, c)));
    }
    @Test
    void test2() {
        int a = 2, b = 4, c = 2;
        double [] expected = {-1};

        assertEquals(Arrays.toString(expected), Arrays.toString(Equation.getRoots(a, b, c)));
    }
    @Test
    void test3() {
        int a = 3, b = 1, c = 2;
        double [] expected = {};

        assertEquals(Arrays.toString(expected), Arrays.toString(Equation.getRoots(a, b, c)));
    }
    @Test
    void test4() {
        int a = 9, b = -12, c = 4;
        double [] expected = {0.6666666666666666};

        assertEquals(Arrays.toString(expected), Arrays.toString(Equation.getRoots(a, b, c)));
    }
}
