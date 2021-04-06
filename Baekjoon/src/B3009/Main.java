package B3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sb.append(br.readLine()).append(" ").append(br.readLine()).append(" ").append(br.readLine());

        StringTokenizer st = new StringTokenizer(sb.toString(), " ");

        sb.delete(0, sb.length());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        if(x1 == x2){
            sb.append(x3).append(" ");
        } else if (x1 == x3){
            sb.append(x2).append(" ");
        } else if(x2 == x3){
            sb.append(x1).append(" ");
        }
        if(y1 == y2){
            sb.append(y3);
        } else if (y1 == y3){
            sb.append(y2);
        } else if(y2 == y3){
            sb.append(y1);
        }

        System.out.println(sb);
    }
}