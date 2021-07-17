package ct713;

public class Solution2 {
    public int[] solution(int rows, int columns, int[][] swipes){
        int[] answer = new int[swipes.length];
        int[][] square = new int[columns + 1][rows + 1];

        int cnt = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                square[j][i] = cnt;
                cnt++;
            }
        }

        for(int i = 0; i < swipes.length; i++){
            int sum = 0;
            int cMin = Math.min(swipes[i][2], swipes[i][4]);
            int cMax = Math.max(swipes[i][2], swipes[i][4]);
            int rMin = Math.min(swipes[i][1], swipes[i][3]);
            int rMax = Math.max(swipes[i][1], swipes[i][3]);
            switch (swipes[i][0]) {
                case 1:
                    for(int j = cMin; j <= cMax; j++){
                        int escapeNum = square[j][rMax];
                        sum += escapeNum;
                        for(int k = rMax; k > 1; k--){
                            square[j][k] = square[j][k - 1];
                        }
                        square[j][rMin] = escapeNum;
                    }
                    break;
                case 2:
                    for(int j = cMin; j <= cMax; j++){
                        int escapeNum = square[j][rMin];
                        sum += escapeNum;
                        for(int k = rMin; k < rMax; k++){
                            square[j][k] = square[j][k + 1];
                        }
                        square[j][rMax] = escapeNum;
                    }
                    break;
                case 3:
                    for(int j = rMin; j <= rMax; j++){
                        int escapeNum = square[cMax][j];
                        sum += escapeNum;
                        for(int k = cMax; k > 1; k--){
                            square[k][j] = square[k - 1][j];
                        }
                        square[cMin][j] = escapeNum;
                    }
                    break;
                case 4:
                    for(int j = rMin; j <= rMax; j++){
                        int escapeNum = square[cMin][j];
                        sum += escapeNum;
                        for(int k = cMin; k < cMax; k++){
                            square[k][j] = square[k + 1][j];
                        }
                        square[cMax][j] = escapeNum;
                    }
                    break;
            }
            answer[i] = sum;
        }

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print(square[j][i] + "\t");
            }
            System.out.println();
        }

        return answer;
    }
}
