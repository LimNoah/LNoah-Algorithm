package Practice.Level0.Java.피자나눠먹기3;

class Solution {
    public int solution(int slice, int n) {
        int answer = n / slice;
        answer += n % slice > 0 ? 1 : 0;
        return answer;
    }
}