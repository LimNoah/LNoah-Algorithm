package Practice.Level1.Java.제일작은수제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        if(arr.length <= 1){
            answer.add(-1);
            return Arrays.stream(answer.toArray(new Integer[1])).mapToInt(Integer::intValue).toArray();
        }
        int minIdx = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[minIdx]){
                minIdx = i;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i == minIdx){
                continue;
            }
            answer.add(arr[i]);
        }
        return Arrays.stream(answer.toArray(new Integer[1])).mapToInt(Integer::intValue).toArray();
    }
}