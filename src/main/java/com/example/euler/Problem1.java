package com.example.euler;

public class Problem1 {

    public int solve (int max, int... multiples) {

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
