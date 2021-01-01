package ProgrammersLevel1.solution1_compareCharCnt;

class Solution {
    boolean solution(String s) {
        boolean answer = false;

        int pCnt = 0;
        int yCnt = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pCnt++;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                yCnt++;
            }
        }

        if((pCnt + yCnt == 0) || pCnt == yCnt){
            answer = true;
        }

        return answer;
    }
}