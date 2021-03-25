package B2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String multiple = Integer.toString(A * B * C);
        int[] idxCnt = new int[10];

        for(int i = 0; i < multiple.length(); i++){
            idxCnt[Character.getNumericValue(multiple.charAt(i))]++;
        }

        for(int arr: idxCnt){
            System.out.println(arr);
        }
    }
}