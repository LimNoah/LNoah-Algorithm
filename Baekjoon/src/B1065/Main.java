package B1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(checkHansu(Integer.parseInt(br.readLine())));
    }

    public static int checkHansu(int N){
        int cnt = 0;
        if(N < 100){
            return N;
        } else {
            cnt = 99;
            for(int i = 100; i <= N; i++){
                String str = Integer.toString(i);
                int prevDiff = Character.getNumericValue(str.charAt(0)) - Character.getNumericValue(str.charAt(1));
                int diff;
                for(int j = 1; j < str.length(); j++){
                    diff = Character.getNumericValue(str.charAt(j - 1)) - Character.getNumericValue(str.charAt(j));
                    if(prevDiff != diff){
                        break;
                    }
                    prevDiff = diff;
                    if(j == str.length() - 1){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}