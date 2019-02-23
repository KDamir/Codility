package kz.test.lesson5.MinAvgTwoSlice;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        int size = A.length;

        if (size < 3) {
            return 0;
        }

        double min  = (A[0] + A[1]) / 2.0;
        int res = 0;

        for (int i = 0; i < size - 2; i++) {
            double a = (A[i] + A[i + 1]) / 2.0;
            double b = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            double minV = min(a, b);

            if (minV < min) {
                min = minV;
                res = i;
            }
        }

        if ( (A[size - 2] + A[size - 1]) / 2.0 < min ) {
            res = size - 2;
        }

        return res;

    }

    public double min (double a, double b) {
        return (a < b) ? a : b;
    }
}