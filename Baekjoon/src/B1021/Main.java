package B1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = 1; i <= N; i++){
            deque.offer(i);
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int pickValue = Integer.parseInt(st.nextToken());
            int pickIdx = deque.indexOf(pickValue);
            int halfIdx;

            halfIdx = deque.size() % 2 == 0 ? deque.size() / 2 - 1 : deque.size() / 2;

            if(pickIdx > halfIdx){
                for(int j = 0; j < deque.size() - pickIdx; j++){
                    deque.offerFirst(deque.pollLast());
                    cnt++;
                }
            } else {
                for(int j = 0; j < pickIdx; j++){
                    deque.offerLast(deque.pollFirst());
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);
    }
}