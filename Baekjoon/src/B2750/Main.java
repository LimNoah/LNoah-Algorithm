package B2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        List<Integer> intList = new ArrayList<>();

        for(int i = 0; i < N; i++){
            intList.add(Integer.parseInt(br.readLine()));
        }

        intList.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        for(int list: intList){
            sb.append(list).append("\n");
        }

        System.out.println(sb);

    }
}