package com.example.euler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem2Test {

  @Test
  void solve() {
    Assertions.assertEquals(4613732, new Problem2().solve(4000000));
  }
}
