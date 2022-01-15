package com.example.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem3Test {

  @Test
  void solve() {
    Assertions.assertEquals(29L, new Problem3().solve(13195L));
    Assertions.assertEquals(6857L, new Problem3().solve(600851475143L));
  }

  @Test
  void isPrime() {
    Assertions.assertTrue(Problem3.isPrime(5L));
    Assertions.assertTrue(Problem3.isPrime(7L));
    Assertions.assertTrue(Problem3.isPrime(13L));
    Assertions.assertTrue(Problem3.isPrime(29L));

    Assertions.assertFalse(Problem3.isPrime(6L));
    Assertions.assertFalse(Problem3.isPrime(8L));
    Assertions.assertFalse(Problem3.isPrime(14L));
    Assertions.assertFalse(Problem3.isPrime(30L));
  }
}
