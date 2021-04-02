package B1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        prime = new boolean[N + 1];
        setPrime();

        for(int i = M; i <= N; i++){
            if(!prime[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static void setPrime(){
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++){
            if(prime[i]){
                continue;
            }
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}