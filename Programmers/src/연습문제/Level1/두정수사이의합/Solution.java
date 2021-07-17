package 연습문제.Level1.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int big = a;
        int small = b;

        if(big < small){
            int tmp = big;
            big = small;
            small = tmp;
        }

        for(int i = small; i <= big; i++){
            answer += i;
        }

        return answer;
    }
}
