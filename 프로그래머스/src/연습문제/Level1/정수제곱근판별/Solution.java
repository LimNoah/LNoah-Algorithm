package 연습문제.Level1.정수제곱근판별;

public class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        return sqrt == (int) sqrt ? (long)Math.pow(sqrt + 1, 2) : -1;
    }
}
