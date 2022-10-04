package Practice.Level1.Java.최대공약수와최소공배수;

public class Solution {
    public long[] solution(long n, long m) {
        long[] answer = new long[2];
        long big = Math.max(n, m);
        long small = Math.min(n, m);

        while(big % small != 0){
            long remainder = big % small;
            big = small;
            small = remainder;
        }
        answer[0] = small;
        answer[1] = m * n / small;

        return answer;
    }
}