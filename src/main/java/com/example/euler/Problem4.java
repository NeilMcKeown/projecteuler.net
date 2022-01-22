package com.example.euler;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 *
 * <p>Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

  public long solve(long min, long max) {

    long largestPalindrome = 1;

    for (long i = min; i <= max; i++) {
      for (long j = i; j <= max; j++) {
        long product = Math.multiplyExact(i, j);
        if ((product > largestPalindrome) && isPalindrome(product)) {
          largestPalindrome = product;
        }
      }
    }

    return largestPalindrome;
  }

  protected static boolean isPalindrome(long number) {
    StringBuilder sb = new StringBuilder(String.valueOf(number));
    return sb.toString().equals(sb.reverse().toString());
  }
}
