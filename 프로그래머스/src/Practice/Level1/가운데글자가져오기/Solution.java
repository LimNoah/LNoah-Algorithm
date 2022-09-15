package Practice.Level1.가운데글자가져오기;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int centerIdx = s.length() / 2;

        if(s.length() % 2 == 1){
            sb.append(s.charAt(centerIdx));
        } else {
            sb.append(s.charAt(centerIdx - 1)).append(s.charAt(centerIdx));
        }

        return sb.toString();
    }
}