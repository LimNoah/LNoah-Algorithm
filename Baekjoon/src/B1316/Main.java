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
            list.add(str.charAt(0));
            if(str.length() > 1){
                for(int j = 1; j < str.length(); j++) {
                    if(!(j == str.length() - 1) && str.charAt(j) == str.charAt(j - 1)){
                        continue;
                    }
                    if(list.contains(str.charAt(j))){
                        break;
                    }
                    list.add(str.charAt(j));
                    if(j == str.length() - 1){
                        cnt++;
                    }
                }
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}