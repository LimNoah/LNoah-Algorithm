package Practice.Level0.Java.배열두배만들기;

public class Solution {
    public int[] solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++)
            numbers[i] *= 2;
        return numbers;
//        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
