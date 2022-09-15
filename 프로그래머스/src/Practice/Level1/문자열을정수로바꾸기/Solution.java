package Practice.Level1.문자열을정수로바꾸기;

class Solution {
    public int solution(String s) {
        int answer = 0;

        StringBuilder sb = new StringBuilder(s);

        answer = s.charAt(0) == '-' ? Integer.parseInt(sb.delete(0, 1).toString()) * -1 : Integer.parseInt(s);

        return answer;
    }
}