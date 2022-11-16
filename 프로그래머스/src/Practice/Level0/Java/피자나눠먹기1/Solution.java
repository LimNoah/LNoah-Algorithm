package Practice.Level0.Java.피자나눠먹기1;

class Solution {
    public int solution(int n) {
        return n / 7 + (n % 7 > 0 ? 1 : 0);
    }
}