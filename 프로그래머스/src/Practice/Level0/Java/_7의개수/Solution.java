package Practice.Level0.Java._7의개수;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for(int i = 0; i < array.length; i++){
            String str = Integer.toString(array[i]);
            answer += str.chars().filter(j -> j == '7').count();
        }

        return answer;
    }
}