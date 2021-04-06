package B3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double R = Integer.parseInt(br.readLine());

        sb.append(String.format("%.6f", R * R * Math.PI)).append("\n").append(String.format("%.6f", 2 * R * R));

        System.out.println(sb);
    }
}