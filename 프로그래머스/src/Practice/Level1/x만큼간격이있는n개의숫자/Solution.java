package Practice.Level1.x만큼간격이있는n개의숫자;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = i == 0 ? x : answer[i - 1] + x;
        }
        return answer;
    }
}