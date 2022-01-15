package com.example.euler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * <p>Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

  public int solve(int max, int... multiples) {
    int sumOfMultiples = 0;

    for (int i = 0; i < max; i++) {
      for (int multiple : multiples) {
        if (i % multiple == 0) {
          sumOfMultiples += i;
          break;
        }
      }
    }

    return sumOfMultiples;
  }
}
