package com.example.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem1Test {

  @Test
  void solve() {
    Assertions.assertEquals(23, new Problem1().solve(10, 3, 5));

    Assertions.assertEquals(233168, new Problem1().solve(1000, 3, 5));
  }
}
