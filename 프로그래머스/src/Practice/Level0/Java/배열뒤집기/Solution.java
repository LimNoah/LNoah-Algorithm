package Practice.Level0.Java.배열뒤집기;

class Solution {
    public int[] solution(int[] num_list) {
        int arrLen = num_list.length;
        int[] answer = new int[arrLen];

        for(int i = 0; i < arrLen; i++) {
            answer[i] = num_list[arrLen - 1 - i];
        }
        return answer;
    }
}