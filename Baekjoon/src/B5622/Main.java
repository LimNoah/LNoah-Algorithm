package B5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int secSum = 0;

        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i);
            if (c >= 65 && c < 68){
                secSum += 3;
            } else if (c >= 68 && c < 71){
                secSum += 4;
            } else if (c >= 71 && c < 74){
                secSum += 5;
            } else if (c >= 74 && c < 77){
                secSum += 6;
            } else if (c >= 77 && c < 80){
                secSum += 7;
            } else if (c >= 80 && c < 84){
                secSum += 8;
            } else if (c >= 84 && c < 87){
                secSum += 9;
            } else if (c >= 87 && c < 91){
                secSum += 10;
            }
        }

        System.out.println(secSum);
    }
}