package Practice.Level1.Java._1차_다트게임;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String dartResult) {
//        int answer = 0;
//        List<Integer> scoreList = new ArrayList<>();
//        int idx = 0;
//
//        for(int i = 0; i < dartResult.length(); i++){
//            // 점수
//            if(dartResult.substring(i).indexOf("10") == 0){
//                scoreList.add(Integer.parseInt(dartResult.substring(i, i + 2)));
//                i += 2;
//            } else {
//                scoreList.add(Character.getNumericValue(dartResult.charAt(i)));
//                i++;
//            }
//
//            // 제곱 보너스
//            int powNum = switch (dartResult.charAt(i)) {
//                case 'D' -> 2;
//                case 'T' -> 3;
//                default -> 1;
//            };
//            scoreList.set(idx, (int)Math.pow(scoreList.get(idx), powNum));
//            if(i >= dartResult.length() - 1){
//                break;
//            } else {
//                i++;
//            }
//
//            // 옵션 적용
//            if(!(dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#')){
//                i--;
//                idx++;
//                continue;
//            }
//            switch (dartResult.charAt(i)) {
//                case '*' -> {
//                    scoreList.set(idx, scoreList.get(idx) * 2);
//                    if (idx != 0) {
//                        scoreList.set(idx - 1, scoreList.get(idx - 1) * 2);
//                    }
//                }
//                case '#' -> scoreList.set(idx, scoreList.get(idx) * -1);
//            }
//            idx++;
//        }
//
//        // 모든 값 더하기
//        for(Integer list: scoreList){
//            answer += list;
//        }
//
//        return answer;
        return 0;
    }
}
