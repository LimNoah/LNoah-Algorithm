package B2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int threeCnt = 0;
        int fiveCnt = 0;

        if(N == 4 || N == 7){
            cnt = -1;
        } else {
            fiveCnt = N / 5;
            N -= fiveCnt * 5;
            if(N == 0){
                cnt = fiveCnt;
            } else {
                while(fiveCnt >= 0){
                    threeCnt = N / 3;
                    N -= threeCnt * 3;
                    if(N == 0){
                        cnt = fiveCnt + threeCnt;
                        break;
                    } else {
                        N += (threeCnt * 3) + 5;
                        if(fiveCnt == 0){
                            cnt = -1;
                        }
                        fiveCnt--;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}