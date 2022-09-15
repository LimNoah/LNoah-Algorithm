package Practice.Level1.이상한문자만들기;

import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, " ", true);

        while (st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.equals(" ")){
                answer.append(str);
                continue;
            }
            for(int i = 0; i < str.length(); i++){
                answer.append(i % 2 == 0 ? Character.toUpperCase(str.charAt(i)) : Character.toLowerCase(str.charAt(i)));
            }
        }
        return answer.toString();
    }
}