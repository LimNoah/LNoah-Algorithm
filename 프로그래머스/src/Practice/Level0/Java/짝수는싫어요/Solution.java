package Practice.Level0.Java.짝수는싫어요;

class Solution {
    public int[] solution(int n) {
        int oddCnt = 0;
        for(int i = 1; i <= n; i++) {
            oddCnt += i % 2 == 1 ? 1 : 0;
        }

        int[] answer = new int[oddCnt];
        int answerIdx = 0;

        for (int i = 1; i <= n ; i+=2) {
            answer[answerIdx] = i;
            answerIdx++;
        }

        return answer;
    }
}