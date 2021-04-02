package B10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringBuilder sb = new StringBuilder();

            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(str, " ");

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = 0;
            int y = 0;
            int cnt = 0;
            boolean isFin = false;

            for(int j = 0; j < W; j++){
                for(int k = 0; k < H; k++){
                    cnt++;
                    if(cnt >= N){
                        x = k + 1;
                        y = j + 1;
                        isFin = true;
                        break;
                    }
                }
                if(isFin){
                    break;
                }
            }
            System.out.println(sb.append(x).append(String.format("%02d", y)).toString());
        }
    }
}