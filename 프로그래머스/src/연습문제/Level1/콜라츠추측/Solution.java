package 연습문제.Level1.콜라츠추측;

class Solution {
    public int solution(long num) {
        int answer = 0;
        long input = num;

        while(input != 1){
            if(answer >= 500){
                return -1;
            }
            input = input % 2 == 0 ? input / 2 : (input * 3) + 1;
            answer++;
        }

        return answer;
    }
}