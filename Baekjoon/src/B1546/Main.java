package B1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int max = 0;
        int sum = 0;

        while(st.hasMoreTokens()){
            int score = Integer.parseInt(st.nextToken());
            sum += score;
            if(score > max){
                max = score;
            }
        }

        double avr = ((double)sum / (double)max * 100) / N;

        System.out.println(avr);
    }
}