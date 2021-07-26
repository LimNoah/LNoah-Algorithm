package ct713;

public class Solution3 {
    public int solution(String line1, String line2){
        int answer = 0;
        int blank = 1;

        while(blank * (line2.length() - 1) + 1 <= line1.length()){
            for(int i = 0; i < line1.length(); i++){
                if(line1.charAt(i) == line2.charAt(0)){
                    int cnt = 0;
                    for(int j = i; j < line1.length(); j += blank){
                        if(line1.charAt(j) == line2.charAt(cnt)){
                            cnt++;
                        } else {
                            break;
                        }
                        if(cnt == line2.length()){
                            answer++;
                            break;
                        }
                    }
                }
            }
            blank++;
        }
        return answer;
    }
}