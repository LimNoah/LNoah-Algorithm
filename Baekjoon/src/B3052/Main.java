package B3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int cnt = 1;

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        Arrays.sort(arr);

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}