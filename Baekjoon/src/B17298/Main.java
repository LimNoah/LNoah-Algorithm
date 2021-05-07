package B17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> idxStack = new Stack<>();

        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        idxStack.push(0);
        for(int i = 1; i < A; i++){
            while(!idxStack.isEmpty() && (arr[idxStack.peek()] < arr[i])){
                arr[idxStack.pop()] = arr[i];
            }
            idxStack.push(i);
        }

        while(!idxStack.isEmpty()){
            arr[idxStack.pop()] = -1;
        }

        for(int idxArr: arr){
            sb.append(idxArr).append(" ");
        }

        System.out.println(sb);
    }
}