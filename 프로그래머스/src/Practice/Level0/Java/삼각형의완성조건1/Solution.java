package Practice.Level0.Java.삼각형의완성조건1;

import java.util.Arrays;

public class Solution {
    public int solution(int[] sides) {
//        int smallSum = 0;
//        int bigIdx = 0;
//        for(int i = 1; i < sides.length; i++) {
//            if(sides[i] > sides[bigIdx]) bigIdx = i;
//        }
//        for (int i = 0; i < sides.length; i++){
//            if(i == bigIdx) continue;
//            smallSum += sides[i];
//        }
//        return smallSum > sides[bigIdx] ? 1 : 2;

        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}
