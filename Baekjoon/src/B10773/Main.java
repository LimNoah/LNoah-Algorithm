package B10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < K; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(stack.isEmpty()){
                    continue;
                }
                stack.pop();
            } else {
                stack.push(input);
            }
        }

        while(!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}