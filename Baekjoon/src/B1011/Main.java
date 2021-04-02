package B1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int dist = y - x;
            int max = (int)Math.sqrt(dist);
            int cnt;

            if(max == Math.sqrt(dist)){
                cnt = 2 * max - 1;
            } else if(dist <= max * max + max){
                cnt = 2 * max;
            } else {
                cnt = 2 * max + 1;
            }

            System.out.println(cnt);
        }
    }
}