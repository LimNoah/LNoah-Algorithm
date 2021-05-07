package B10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            switch (str.charAt(0)){
                case 'p':
                    if(str.contains("push")){
                        if(str.contains("front")){
                            deque.addFirst(Integer.parseInt(str.substring(11)));
                        } else {
                            deque.addLast(Integer.parseInt(str.substring(10)));
                        }
                    } else {
                        sb.append(deque.isEmpty() ? -1 : (str.contains("front") ? deque.pollFirst() : deque.pollLast())).append("\n");
                    }
                    break;
                case 's':
                    sb.append(deque.size()).append("\n");
                    break;
                case 'e':
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 'f':
                    sb.append(deque.isEmpty() ? -1 : deque.getFirst()).append("\n");
                    break;
                case 'b':
                    sb.append(deque.isEmpty() ? -1 : deque.getLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}