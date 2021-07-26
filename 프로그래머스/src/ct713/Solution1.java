package ct713;

public class Solution1 {
    public int solution(int money, int minratio, int maxratio, int ranksize, int threshold, int months){
        if(maxratio == 0){
            return money;
        }

        int answer = -1;
        long haveMoney = money;
        long calcMoney;

        for(int i = 1; i <= months; i++){
            calcMoney = haveMoney / 100 * 100;
            int ratio = minratio;
            if(calcMoney < threshold){
                continue;
            }
            int plusRatio = 1;
            while(true){
                if(calcMoney > threshold + (ranksize * plusRatio - 1)){
                    plusRatio++;
                    continue;
                }
                ratio = Math.min(ratio + plusRatio - 1, maxratio);
                break;
            }
            long payment = calcMoney * ratio / 100;
            haveMoney -= payment;
        }

        answer = (int)haveMoney;

        return answer;
    }
}