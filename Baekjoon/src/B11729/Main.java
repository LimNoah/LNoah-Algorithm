package B11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int cnt = (int)Math.pow(2, N) - 1;

        sb.append(cnt).append("\n");

        Hanoi(N, 1, 2, 3, sb);

        System.out.println(sb);
    }

    public static void Hanoi(int N, int from, int mid, int to, StringBuilder sb){
        if (N == 1){
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        Hanoi(N - 1, from, to, mid, sb);
        sb.append(from).append(" ").append(to).append("\n");
        Hanoi(N - 1, mid, from, to, sb);
    }
}