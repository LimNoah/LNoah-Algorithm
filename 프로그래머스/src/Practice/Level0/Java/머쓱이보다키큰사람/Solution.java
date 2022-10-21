package Practice.Level0.Java.머쓱이보다키큰사람;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int fHeight : array) {
            answer += fHeight > height ? 1 : 0;
        }
        return answer;
    }
}