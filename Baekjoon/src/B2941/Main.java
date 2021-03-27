package B2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder().append(br.readLine()).append("  ");

        int cnt = 0;

        for(int i = 0; i < sb.length() - 2; i++){
            if(sb.charAt(i) == 'c' && (sb.charAt(i + 1) == '=' || sb.charAt(i + 1) == '-') ||
                    (sb.charAt(i) == 'l' && sb.charAt(i + 1) == 'j') ||
                    (sb.charAt(i) == 'n' && sb.charAt(i + 1) == 'j') ||
                    (sb.charAt(i) == 's' && sb.charAt(i + 1) == '=') ||
                    (sb.charAt(i) == 'z' && sb.charAt(i + 1) == '=')){
                i++;
            } else if (sb.charAt(i) == 'd'){
                if(sb.charAt(i + 1) == '-'){
                    i++;
                } else if (sb.charAt(i + 1) == 'z' && sb.charAt(i + 2) == '='){
                    i += 2;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}