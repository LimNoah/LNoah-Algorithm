package B1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            List<Character> list = new ArrayList<>();
            if(str.length() < 2){
                cnt++;
                continue;
            }
            char recentChar = str.charAt(0);
            list.add(recentChar);
            for(int j = 1; j < str.length(); j++){
                if(recentChar == str.charAt(j)){
                    if(j == str.length() - 1){
                        cnt++;
                    }
                    continue;
                } else if(list.contains(str.charAt(j))){
                    break;
                }
                if(j == str.length() - 1){
                    cnt++;
                }
                list.add(str.charAt(j));
                recentChar = str.charAt(j);
            }
        }
        System.out.println(cnt);
    }
}