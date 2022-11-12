package Practice.Level0.Java.짝수홀수개수;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int el : num_list){
            answer[el % 2]++;
        }
        return answer;
    }
}