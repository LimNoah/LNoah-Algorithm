package Btest10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        String[] s = {
//                "1110",
//                "100111100",
//                "0111111010"
//        };
//
//        String[] answer = new String[s.length];
//
//        for (int i = 0; i < s.length; i++) {
//            StringBuilder sb = new StringBuilder(s[i]);
//            int zeroIdx = sb.lastIndexOf("110");
//            int oneIdx = sb.indexOf("111");
//            while (oneIdx >= 0 && zeroIdx >= 0 && oneIdx < zeroIdx) {
//                sb.delete(zeroIdx, zeroIdx + 3);
//                sb.insert(oneIdx, "110");
//                zeroIdx = sb.lastIndexOf("110");
//                oneIdx = sb.indexOf("111");
//            }
//            answer[i] = sb.toString();
//        }
//
//        for (String value : answer) {
//            System.out.println(value);
//        }

        long[] numbers = {31, 7};

        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            boolean zegop = true;
            Long l1 = numbers[i];
            int tmp = l1.intValue() + 1;
            while(tmp >= 2){
                if(tmp % 2 != 0){
                    zegop = false;
                    break;
                }
                tmp /= 2;
            }
            answer[i] = zegop ? numbers[i] + numbers[i] / 2 + 1 : numbers[i] + 1;
        }

        for (long l : answer) {
            System.out.println(l);
        }
    }
}