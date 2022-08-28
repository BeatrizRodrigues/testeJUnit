package com.teste.testejunit;

import org.junit.jupiter.api.Test;

public class SortTest {

    @Test
    void testClass() {
        Sort s1 = new Sort();
    }

    @Test
    void test() {
        int [] value = {4, 3, 12, 8, 9, 15, 18};
        Sort.sort(value);
    }
}
