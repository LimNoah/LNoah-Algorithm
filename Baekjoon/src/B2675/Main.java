package B2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String inputStr = br.readLine();
            StringTokenizer st = new StringTokenizer(inputStr, " ");
            int repeatCnt = Integer.parseInt(st.nextToken());
            String outputStr = st.nextToken();
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < outputStr.length(); j++){
                for(int k = 0; k < repeatCnt; k++){
                    sb.append(outputStr.charAt(j));
                }
            }
            System.out.println(sb);
        }
    }
}