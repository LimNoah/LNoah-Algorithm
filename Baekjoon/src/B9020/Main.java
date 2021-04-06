package B9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int diff = Integer.MAX_VALUE;
            int small = 0;
            int big = 0;

            prime = new boolean[n + 1];
            setPrime();

            for(int j = 2; j <= n / 2; j++){
                if(!prime[j] && !prime[n - j] && diff > n - (2 * j)){
                    small = j;
                    big = n - j;
                }
            }
            sb.append(small).append(" ").append(big).append("\n");
        }
        System.out.println(sb);
    }

    public static void setPrime(){
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]){
                continue;
            }
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}