package 연습문제.Level1.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String longToStr = Long.toString(n);
        Character[] characters = new Character[longToStr.length()];
        for(int i = 0; i < longToStr.length(); i++){
            characters[i] = longToStr.charAt(i);
        }
        Arrays.sort(characters, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Character character : characters) {
            sb.append(character);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
