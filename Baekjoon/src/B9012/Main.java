package B9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '('){
                    stack.push('j');
                } else {
                    if(stack.isEmpty()){
                        sb.append("NO").append("\n");
                        break;
                    } else {
                        stack.pop();
                    }
                }
                if(j == str.length() - 1){
                    sb.append(stack.isEmpty() ? "YES\n" : "NO\n");
                }
            }
        }

        System.out.println(sb);
    }
}