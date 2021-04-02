package B2581b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = M; i <= N; i++){
            if(i == 1){
                continue;
            }
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                if(min == Integer.MAX_VALUE){
                    min = i;
                }
                sum += i;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder().append(sum).append("\n").append(min);
            System.out.println(sb);
        }
    }
}