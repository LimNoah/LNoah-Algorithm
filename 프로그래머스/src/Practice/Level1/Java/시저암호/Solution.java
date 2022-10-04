package Practice.Level1.Java.시저암호;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char inputChar = s.charAt(i);
            if(!(s.charAt(i) == 32)){
                inputChar += n;
            }
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                if(s.charAt(i) + n > 122){
                    inputChar -= 26;
                }
            } else if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                if(s.charAt(i) + n > 90){
                    inputChar -= 26;
                }
            }
            sb.append(inputChar);
        }
        return sb.toString();
    }
}