package B4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        while(x != 0 && y != 0 && z != 0){
            int max = Math.max(Math.max(x, y), z);

            if(max == x){
                if(x * x == y * y + z * z){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else if(max == y){
                if(y * y == x * x + z * z){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else {
                if(z * z == x * x + y * y){
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }

            st = new StringTokenizer(br.readLine(), " ");

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
        }
    }
}