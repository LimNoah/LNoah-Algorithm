package B1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            Queue<Integer> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            int printCnt = 0;

            while (st.hasMoreTokens()){
                int value = Integer.parseInt(st.nextToken());
                queue.offer(value);
                priorityQueue.offer(value);
            }

            while(true){
                if(queue.peek() < priorityQueue.peek()){
                    queue.offer(queue.poll());
                } else {
                    queue.poll();
                    priorityQueue.poll();
                    printCnt++;
                    if(M == 0){
                        break;
                    }
                }
                M += (M - 1) < 0 ? queue.size() - 1 : -1;
            }
            sb.append(printCnt).append("\n");
        }
        System.out.println(sb);
    }
}