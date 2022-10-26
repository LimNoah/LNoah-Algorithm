package Practice.Level0.Java.배열의평균값;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int el : numbers){
            sum += el;
        }
        answer = sum / numbers.length;
        return answer;
    }
}