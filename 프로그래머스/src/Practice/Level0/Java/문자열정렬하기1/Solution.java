package Practice.Level0.Java.문자열정렬하기1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        // Hard coding
//        char[] charArr = my_string.toCharArray();
//
//        Arrays.sort(charArr);
//
//        List<Integer> intList = new ArrayList<>();
//        for (char c : charArr) {
//            if ((int) c >= 48 && (int) c <= 57)
//                intList.add((int) c - 48);
//        }
//        int[] answer = new int[intList.size()];
//        for(int i = 0; i < intList.size(); i++){
//            answer[i] = intList.get(i);
//        }

        // Stream
        return Arrays
                .stream(my_string.replaceAll("[A-Z|a-z]", "").split(""))
                .sorted().mapToInt(Integer::parseInt).toArray();
    }
}