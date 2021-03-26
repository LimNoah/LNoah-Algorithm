package B10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        String S = br.readLine();

        Arrays.fill(arr, -1);

        for(int i = 0; i < S.length(); i++){
            int c = S.charAt(i) - 97;
            if(arr[c] < 0){
                arr[c] = i;
            }
        }

        for (int j : arr) {
            sb.append(j).append(" ");
        }
        System.out.println(sb);
    }
}