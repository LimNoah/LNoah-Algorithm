package B2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);
    }
}