package com.example.euler;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By
 * starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
public class Problem2 {

  public int solve(int maximum) {

    int sumOfEvenValuedTerms = 0;
    int term1 = 1;
    int term2 = 2;

    while (term2 < maximum) {
      if (term2 % 2 == 0) {
        sumOfEvenValuedTerms += term2;
      }

      int termSum = term1 + term2;

      term1 = term2;
      term2 = termSum;
    }

    return sumOfEvenValuedTerms;
  }
}
