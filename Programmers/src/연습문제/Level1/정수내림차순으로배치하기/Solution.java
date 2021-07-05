package 연습문제.Level1.정수내림차순으로배치하기;

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String longStr = Long.toString(n);
        int length = longStr.length();
        Character[] characters = new Character[length];
        for(int i = 0; i < length; i++){
            characters[i] = longStr.charAt(i);
        }
        Arrays.sort(characters);
        Arrays.
        return answer;
    }
}