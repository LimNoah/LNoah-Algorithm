package Practice.Level0.Java.문자열뒤집기;

class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
    }
}