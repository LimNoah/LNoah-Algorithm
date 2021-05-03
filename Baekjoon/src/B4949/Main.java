package B4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        while(str.charAt(0) != '.'){
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '(' || str.charAt(i) == '['){
                    stack.push(str.charAt(i));
                } else if(str.charAt(i) == ')' || str.charAt(i) == ']') {
                    if(stack.isEmpty() || ((str.charAt(i) == ')' && stack.peek() != '(') || (str.charAt(i) == ']' && stack.peek() != '['))){
                        sb.append("no").append("\n");
                        break;
                    } else {
                        stack.pop();
                    }
                }

                if(i == str.length() - 1){
                    sb.append(stack.isEmpty() ? "yes\n" : "no\n");
                }
            }
            str = br.readLine();
        }
        System.out.println(sb);
    }
}