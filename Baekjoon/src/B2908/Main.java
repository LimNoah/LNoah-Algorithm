package B2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        String A = st.nextToken();
        String B = st.nextToken();

        int a = Integer.parseInt(sb.append(A).reverse().toString());
        sb.delete(0, sb.length());
        int b = Integer.parseInt(sb.append(B).reverse().toString());
        sb.delete(0, sb.length());
        sb.append(Math.max(a, b));

        System.out.println(sb);
    }
}