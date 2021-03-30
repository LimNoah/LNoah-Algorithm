package B1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;
        int cnt = 1;

        int tmp = N;
        while(tmp - cnt > 0){
            tmp -= cnt++;
        }

        if(cnt % 2 == 1){
            x = cnt - tmp  + 1;
            y = tmp;
        } else {
            x = tmp;
            y = cnt - tmp + 1;
        }

        System.out.println(x + "/" + y);
    }
}