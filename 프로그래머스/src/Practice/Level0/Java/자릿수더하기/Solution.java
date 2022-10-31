package Practice.Level0.Java.자릿수더하기;

class Solution {
    public int solution(int n) {
        int sum = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
}