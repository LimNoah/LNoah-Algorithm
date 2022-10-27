package Practice.Level0.Java.배열자르기;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int length = num2 - num1 + 1;
        int[] answer = new int[length];

        int cnt = 0;
        for(int i = num1; i <= num2; i++){
            answer[cnt] = numbers[i];
            cnt++;
        }

        return answer;
    }
}