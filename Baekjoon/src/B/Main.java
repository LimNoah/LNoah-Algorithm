package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int cnt = 1;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < cnt; j++){
                sb.append("*");
            }
            sb.append("\n");
            cnt++;
        }

        System.out.println(sb);
    }
}