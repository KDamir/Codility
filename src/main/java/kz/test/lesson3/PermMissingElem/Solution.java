package kz.test.lesson3.PermMissingElem;

// you can also use imports, for example:
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        if (A.length == 0) {
            return 1;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {

            if (i != A[i] - 1) {
                return A[i] - 1;
            }

        }

        return A[A.length-1] + 1;

    }
}
