package Practice.Level1.Java.문자열다루기기본;

public class Solution {
    public boolean solution(String s) {
        boolean length;
        boolean allNum = true;

        length = s.length() == 4 || s.length() == 6;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < 48 || s.charAt(i) > 57){
                allNum = false;
                break;
            }
        }

        return length && allNum;
    }
}
