package Practice.Level0.Java.모음제거;

class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[a|e|i|o|u]", "");
    }
}