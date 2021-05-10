package Btest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] s = {{"XXXXX", "XXXXX", "XXXXP", "XXXXP", "XXXXX"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPXX", "OXXXP", "POOXX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        int[] answer = new int[s.length];

        for(int room = 0; room < 5; room++){
            boolean isFollow = true;
            for(int y = 0; y < 5; y++){
                for(int x = 0; x < 5; x++){
                    if(s[room][y].charAt(x) == 'P'){
                        if(x < 4 && y < 4) {
                            if(s[room][y].charAt(x + 1) == 'P' || s[room][y + 1].charAt(x) == 'P'){
                                isFollow = false;
                                break;
                            }
                        } else if (x == 4 && y == 4){
                        } else if(x == 4){
                            if(s[room][y + 1].charAt(x) == 'P'){
                                isFollow = false;
                                break;
                            }
                        } else {
                            if(s[room][y].charAt(x + 1) == 'P'){
                                isFollow = false;
                                break;
                            }
                        }
                    } else if(s[room][y].charAt(x) == 'O'){
                        int cnt = 0;
                        if(y == 0 && x == 0){
                            cnt += s[room][y].charAt(x + 1) == 'P' ? 1 : 0;
                            cnt += s[room][y + 1].charAt(x) == 'P' ? 1 : 0;
                        } else if (x == 4 && y == 0) {
                            cnt += s[room][y].charAt(x - 1) == 'P' ? 1 : 0;
                            cnt += s[room][y + 1].charAt(x) == 'P' ? 1 : 0;
                        } else if (x == 0 && y == 4) {
                            cnt += s[room][y].charAt(x + 1) == 'P' ? 1 : 0;
                            cnt += s[room][y - 1].charAt(x) == 'P' ? 1 : 0;
                        } else if (x == 4 && y == 4) {
                            cnt += s[room][y].charAt(x - 1) == 'P' ? 1 : 0;
                            cnt += s[room][y - 1].charAt(x) == 'P' ? 1 : 0;
                        } else if (x == 0){
                            cnt += s[room][y].charAt(x + 1) == 'P' ? 1 : 0;
                            cnt += s[room][y + 1].charAt(x) == 'P' ? 1 : 0;
                            cnt += s[room][y - 1].charAt(x) == 'P' ? 1 : 0;
                        } else if (x == 4) {
                            cnt += s[room][y].charAt(x - 1) == 'P' ? 1 : 0;
                            cnt += s[room][y + 1].charAt(x) == 'P' ? 1 : 0;
                            cnt += s[room][y - 1].charAt(x) == 'P' ? 1 : 0;
                        } else if(y == 0){
                            cnt += s[room][y].charAt(x + 1) == 'P' ? 1 : 0;
                            cnt += s[room][y].charAt(x - 1) == 'P' ? 1 : 0;
                            cnt += s[room][y + 1].charAt(x) == 'P' ? 1 : 0;
                        } else if (y == 4) {
                            cnt += s[room][y].charAt(x + 1) == 'P' ? 1 : 0;
                            cnt += s[room][y].charAt(x - 1) == 'P' ? 1 : 0;
                            cnt += s[room][y - 1].charAt(x) == 'P' ? 1 : 0;
                        } else {
                            cnt += s[room][y].charAt(x + 1) == 'P' ? 1 : 0;
                            cnt += s[room][y].charAt(x - 1) == 'P' ? 1 : 0;
                            cnt += s[room][y + 1].charAt(x) == 'P' ? 1 : 0;
                            cnt += s[room][y - 1].charAt(x) == 'P' ? 1 : 0;
                        }
                        isFollow = cnt < 2;
                        if(!isFollow){
                            break;
                        }
                    }
                }
                if(!isFollow){
                    break;
                }
            }
            if(isFollow){
                isFollow = s[room][4].charAt(4) != 'P' || (s[room][3].charAt(4) != 'P' && s[room][4].charAt(3) != 'P');
            }
            // 결과저장
            answer[room] = isFollow ? 1 : 0;
        }

        for (int arr: answer){
            System.out.println(arr);
        }
    }
}