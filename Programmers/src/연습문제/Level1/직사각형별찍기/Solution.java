package 연습문제.Level1.직사각형별찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int horizontal = Integer.parseInt(st.nextToken());
        int vertical = Integer.parseInt(st.nextToken());

        for(int i = 0; i < vertical; i++){
            for(int j = 0; j < horizontal; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
