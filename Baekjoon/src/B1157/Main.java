package B1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i);
            if(c > 90){
                c -= 97;
            } else {
                c -= 65;
            }
            arr[c]++;
        }

        int idx = 0;
        int max = arr[idx];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[idx]){
                idx = i;
                max = arr[i];
            }
        }

        int cnt = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                cnt++;
            }
        }

        if(cnt > 1){
            System.out.println("?");
        } else {
            System.out.println((char)(idx + 65));
        }
    }
}