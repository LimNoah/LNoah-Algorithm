package Practice.Level1.Java.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int starEndIdx = phone_number.length() - 4;
        for(int i = 0; i < starEndIdx; i++){
            answer.append("*");
        }
        answer.append(phone_number.substring(starEndIdx));
        return answer.toString();
    }
}