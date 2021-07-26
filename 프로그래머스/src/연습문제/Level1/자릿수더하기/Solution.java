package 연습문제.Level1.자릿수더하기;

public class Solution {
    public int solution(Integer n) {
        int answer = 0;
        String s = n.toString();
        for(int i = 0; i < s.length(); i++){
            answer += Character.getNumericValue(s.charAt(i));
        }
        return answer;
    }
}