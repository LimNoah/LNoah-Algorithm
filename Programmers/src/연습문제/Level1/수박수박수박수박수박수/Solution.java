package 연습문제.Level1.수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int sbCnt = n / 2;
        int remain = n % 2;

        for(int i = 0; i < sbCnt; i++){
            sb.append("수박");
        }
        if(remain == 1){
            sb.append("수");
        }

        return sb.toString();
    }
}
