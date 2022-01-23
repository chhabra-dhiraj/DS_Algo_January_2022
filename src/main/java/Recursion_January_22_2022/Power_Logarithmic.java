package Recursion_January_22_2022;

import java.util.Scanner;

public class Power_Logarithmic {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if(n == 1) {
            return x;
        }

        int halfPower = power(x, n / 2);

        if(n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }

}
