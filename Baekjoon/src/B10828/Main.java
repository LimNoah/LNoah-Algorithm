package B10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        // Stringbuilder 사용
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            if(str.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(str.equals("pop")){
                if(stack.size() == 0){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if(str.equals("size")){
                sb.append(stack.size()).append("\n");
            } else if(str.equals("empty")){
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if(str.equals("top")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                } else{
                    int pop = stack.pop();
                    sb.append(pop).append("\n");
                    stack.push(pop);
                }
            }
        }

        System.out.println(sb);

//        Stringbuilder 사용 x
//        for(int i = 0; i < N; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            String str = st.nextToken();
//            if(str.equals("push")){
//                stack.push(Integer.parseInt(st.nextToken()));
//            } else if(str.equals("pop")){
//                if(stack.size() == 0){
//                    System.out.println(-1);
//                } else {
//                    System.out.println(stack.pop());
//                }
//            } else if(str.equals("size")){
//                System.out.println(stack.size());
//            } else if(str.equals("empty")){
//                System.out.println(stack.isEmpty() ? 1 : 0);
//            } else if(str.equals("top")){
//                if(stack.isEmpty()){
//                    System.out.println(-1);
//                } else{
//                    int pop = stack.pop();
//                    System.out.println(pop);
//                    stack.push(pop);
//                }
//            }
//        }
    }
}