package 연습문제.Level1.자연수뒤집어배열로만들기;

public class Solution {
    public int[] solution(long n) {
        String input = String.valueOf(n);
        int[] answer = new int[input.length()];

        for(int i = 0; i < input.length(); i++){
            answer[input.length() - 1 - i] = Character.getNumericValue(input.charAt(i));
        }

        return answer;
    }
}
