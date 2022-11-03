package Practice.Level0.Java.중복된숫자개수;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int el : array) {
            answer += el == n ? 1 : 0;
        }
        return answer;
    }
}