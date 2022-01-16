package com.example.euler;

import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

  public int solve(int max, int... factors) {
    return IntStream.rangeClosed(0, max - 1)
        .parallel()
        .filter(i -> IntStream.of(factors).parallel().anyMatch(j -> i % j == 0))
        .sum();
  }
}
