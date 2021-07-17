package 연습문제.Level1.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i: arr){
            answer += i;
        }
        return answer / arr.length;
    }
}