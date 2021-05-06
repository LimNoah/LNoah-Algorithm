package B1874resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int start = 0;

        for(int i = 1; i <= n; i++){
            int value = Integer.parseInt(br.readLine());

            if(start < value){
                for(int j = start + 1; j <= value; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                start = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}