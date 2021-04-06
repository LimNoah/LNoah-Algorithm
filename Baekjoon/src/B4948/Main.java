package B4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N;

        while((N = Integer.parseInt(br.readLine())) != 0){
            if(N == 1){
                sb.append(1).append("\n");
                continue;
            }

            prime = new boolean[(2 * N) + 1];
            setPrime();
            int cnt = 0;

            for(int i = N + 1; i <= (2 * N); i++){
                if(!prime[i]){
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
    public static void setPrime(){
        prime[0] = true;
        prime[1] = true;

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
