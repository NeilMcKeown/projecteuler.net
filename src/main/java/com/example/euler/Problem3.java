package com.example.euler;

import java.util.stream.LongStream;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * <p>What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

  public long solve(long maximum) {
    return LongStream.rangeClosed(1L, (long) Math.sqrt(maximum))
        .parallel()
        .filter(i -> maximum % i == 0)
        .filter(Problem3::isPrime)
        .max()
        .getAsLong();
  }

  public static boolean isPrime(long number) {
    return number > 1
        && LongStream.rangeClosed(2, (long) Math.sqrt(number)).noneMatch(n -> (number % n == 0L));
  }
}
