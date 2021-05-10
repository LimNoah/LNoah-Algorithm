package Btest3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> kStack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        int n = 8;  // 행의 개수
        int k = 2;  // 선택된 행

        for(int i = 0; i < n; i++){
            list.add(i, i);
        }

        String[] cmd = {
                "D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"
        };


        for(int i = 0; i < cmd.length; i++){
            switch(cmd[i].charAt(0)){
                case 'U':
                    k -= Integer.parseInt(cmd[i].substring(2));
                    if(k < 0){
                        k = 0;
                    }
                    break;
                case 'D':
                    k += Integer.parseInt(cmd[i].substring(2));
                    if(k > list.size() - 1){
                        k = list.size() - 1;
                    }
                    break;
                case 'C':
                    kStack.push(k);
                    valueStack.push(list.get(k));
                    list.remove(k);
                    if(k > list.size() - 1){
                        k = list.size() - 1;
                    }
                    break;
                case 'Z':
                    k += kStack.peek() <= k ? 1 : 0;
                    list.add(kStack.pop(), valueStack.pop());
                    break;
            }
        }

        for(int i = 0; i < n; i++){
            sb.append(list.contains(i) ? 'O' : 'X');
        }
        System.out.println(sb.toString());
    }
}