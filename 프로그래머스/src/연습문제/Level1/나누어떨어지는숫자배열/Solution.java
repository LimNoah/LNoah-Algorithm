package 연습문제.Level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        List<Integer> integerList = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0 && !integerList.contains(i)) {
                integerList.add(i);
            }
        }

        if(integerList.size() > 0){
            Collections.sort(integerList);
        } else {
            integerList.add(-1);
        }

        return integerList.toArray(new Integer[0]);
    }
}
