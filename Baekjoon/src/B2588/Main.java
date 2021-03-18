package B2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum1 = (((A / 100) * 100) * (B % 10)) + (((A / 10) % 10 * 10) * (B % 10)) + ((A % 10) * (B % 10));
        int sum2 = (((A / 100) * 100) * ((B / 10) % 10)) + (((A / 10) % 10 * 10) * ((B / 10) % 10)) + ((A % 10) * ((B / 10) % 10));
        int sum3 = (((A / 100) * 100) * (B / 100)) + (((A / 10) % 10 * 10) * (B / 100)) + ((A % 10) * (B / 100));
        int sum4 = sum1 + (sum2 * 10) + (sum3 * 100);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}