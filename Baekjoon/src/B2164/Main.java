package B2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }

        while(queue.size() > 1){
            queue.poll();
            if(queue.size() <= 1){
                break;
            }
            Integer offerValue = queue.poll();
            queue.offer(offerValue);
        }
        System.out.println(queue.poll());
    }
}