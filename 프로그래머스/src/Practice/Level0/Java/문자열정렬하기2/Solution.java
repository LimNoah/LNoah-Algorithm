package Practice.Level0.Java.문자열정렬하기2;

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);

        return new String(charArr);
    }
}