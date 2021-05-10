package Btest4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int start = 1;
        int end = 4;
        int[][] roads = {
                {1, 2 ,1}, {3, 2 ,1}, {2, 4, 1}
        };
        int[] traps = {2, 3};
        int result = 0;
        int curIdx = 0;
        boolean isArrived = false;
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < roads.length; i++){
            if(roads[i][0] == start){
                curIdx = i;
            }
        }

        while(!isArrived){
            result += roads[curIdx][2];
            curIdx = roads[curIdx][1];

            boolean isTrap = false;
            for(int i = 0; i < traps.length; i++){
                isTrap = traps[i] == curIdx;
                if(isTrap){
                    break;
                }
            }
            if(isTrap){
                for(int i = 0; i < roads.length; i++){
                    int tmp = roads[i][0];
                    roads[i][0] = roads[i][1];
                    roads[i][1] = tmp;
                }
            }
        }

        System.out.println(result);
    }
}