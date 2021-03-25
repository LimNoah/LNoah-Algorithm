package B1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int tmp = N;
        int cnt = 0;

        do{
            tmp = ((tmp % 10) * 10) + (((tmp / 10) + (tmp % 10)) % 10);
            cnt++;
        }
        while(!(N == tmp));

        System.out.println(cnt);
    }
}