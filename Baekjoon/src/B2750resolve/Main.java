package B2750resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] inputs = new int[num];
        for (int i = 0; i < num; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(inputs);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(inputs[i]).append("\n");
        }
        System.out.println(sb);
    }
}