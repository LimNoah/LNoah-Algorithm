package B4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        for(int i = 0; i < C; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int sum = 0;
            int tmp = 0;

            while(st.hasMoreTokens()){
                arr[tmp] = Integer.parseInt(st.nextToken());
                sum += arr[tmp];
                tmp++;
            }

            int avr = sum / N;

            int passCnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > avr){
                    passCnt++;
                }
            }

            double passRate = (double)passCnt / (double)N * 100;

            System.out.println(String.format("%.3f", passRate) + "%");
        }
    }
}