package B1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        if(N < 100){
            cnt = N;
        }

        for(int i = 1; i <= N; i++){
            String str = Integer.toString(i);
            int diff = 0;
            for(int j = 1; j < str.length(); j++){
                diff = Character.getNumericValue(str.charAt(i - 1)) - Character.getNumericValue(str.charAt(i));
            }
        }

        System.out.println(cnt);
    }
}