package kz.test.lesson6;

// you can also use imports, for example:
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        Arrays.sort(A);

        if (A.length == 0) {
            return 0;
        }

        if (A.length == 1) {
            return 1;
        }

        int count = 1;
        int prev = A[0];

        for (int i = 0; i < A.length; i++) {

            if (prev != A[i]) {
                count++;
                prev = A[i];
            }

        }

        return count;

    }
}