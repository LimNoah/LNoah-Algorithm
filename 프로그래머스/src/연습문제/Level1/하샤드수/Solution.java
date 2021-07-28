package 연습문제.Level1.하샤드수;

public class Solution {
    public boolean solution(int x) {
        String input = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < input.length(); i++){
            sum += Character.getNumericValue(input.charAt(i));
        }
        return x % sum == 0;
    }
}