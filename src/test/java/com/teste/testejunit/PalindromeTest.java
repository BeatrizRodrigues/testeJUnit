package com.teste.testejunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @Test
    void testClass() {
        Palindrome p1 = new Palindrome();
    }

    @Test
    void test0() {
        String str = "tenet";

        assertEquals(true, Palindrome.palindrome(str));
    }

    @Test
    void test1() {
        String str = "{amor}";

        assertEquals(false, Palindrome.palindrome(str));
    }

    @Test
    void test2() {
        String str = "Abacaxi";

        assertEquals(false, Palindrome.palindrome(str));
    }

    @Test
    void test3() {
        String str = "Girafarig";

        assertEquals(true, Palindrome.palindrome(str));
    }
}
