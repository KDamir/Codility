package kz.test.lesson5.CountDiv;

class Solution {
    public int solution(int A, int B, int K) {

        int ost = A % K;

        if (ost != 0) {
            A += K - ost;
        }

        if (A > B) {
            return 0;
        }

        return ((B - A) / K) + 1;

    }
}
