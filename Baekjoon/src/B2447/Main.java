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

        pattern(N, 0, 0, false);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(stars[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void pattern(int N, int x, int y, boolean isBlank){
        if(isBlank){
            for(int i = x; i < x + N; i++){
                for(int j = y; j < y + N; j++){
                    stars[i][j] = ' ';
                }
            }
            return;
        }

        if(N == 1){
            stars[x][y] = '*';
            return;
        }

        int cnt = 0;
        for(int i = x; i < x + N; i += N / 3){
            for(int j = y; j < y + N; j += N / 3){
                if(cnt == 4){
                    pattern(N / 3, i, j, true);
                } else {
                    pattern(N / 3, i, j, false);
                }
                cnt++;
            }
        }
    }
}