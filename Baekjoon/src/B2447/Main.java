package B2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static char[][] stars;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        stars = new char[N][N];

        pattern(N);

        for(int i = 0; i < stars.length; i++){
            for(int j = 0; j < stars[0].length; j++){
                sb.append(stars[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
    public static void pattern(int N){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

            }
        }
    }
}