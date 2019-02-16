// you can also use imports, for example:
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


class Solution {
    public int solution(int[] A) {
        
        if (A.length == 1) {
            if (A[0] != 1) {
                return 1;
            } else {
                return 2;
            }
        }
        
        Arrays.sort(A);
        
        int min = A[0] + 1;
        
        for (int i = 0; i < A.length; i++) {
            
            if (min > A[i]) {
                continue;
            } else if (min < A[i]) {
                
                if (A[i] <= 1) {
                    min = A[i] + 1;
                    continue;
                } else {
                    break;
                }
                
            } else {
                min++;
            }
            
        }
        
        if (A[0] > 0 && A[0] != 1) {
            return 1;
        }
        
        if (min < 1) {
            return 1;
        } else {
            return min;
        }
        
    }
}