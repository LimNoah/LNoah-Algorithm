package B10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }
    public static int factorial(int N){
        if(N == 0){
            return 1;
        } else {
            return N * factorial(N - 1);
        }
    }
}