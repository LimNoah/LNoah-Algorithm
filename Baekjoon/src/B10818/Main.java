package B10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min + " " + max);
    }
}