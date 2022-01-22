package com.example.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TimingExtension.class)
class Problem4Test {

    @Test
    void solve() {
        Assertions.assertEquals(9009, new Problem4().solve(10, 99));
        Assertions.assertEquals(906609, new Problem4().solve(100, 999));
        Assertions.assertEquals(99000099, new Problem4().solve(1000, 10000));
    }

    @Test
    void isPalindrome() {
        Assertions.assertTrue(Problem4.isPalindrome(1));
        Assertions.assertTrue(Problem4.isPalindrome(22));
        Assertions.assertTrue(Problem4.isPalindrome(333));
        Assertions.assertTrue(Problem4.isPalindrome(4444));
        Assertions.assertTrue(Problem4.isPalindrome(55555));
        Assertions.assertTrue(Problem4.isPalindrome(666666));

        // Assert false
        Assertions.assertFalse(Problem4.isPalindrome(10));
        Assertions.assertFalse(Problem4.isPalindrome(998));
        Assertions.assertFalse(Problem4.isPalindrome(9998));
    }
}
