package Practice.Level0.Java.두수의나눗셈;

class Solution {
    public int solution(int num1, int num2) {
        double answer = ((double) num1 / (double) num2) * 1000;
        return (int)answer;
    }
}