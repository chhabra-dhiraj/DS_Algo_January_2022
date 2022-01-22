package Recursion_January_22_2022;

import java.util.Scanner;

public class Power_Linear {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x, n));
    }

    private static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        int result = x * power(x, n - 1);

        return result;
    }
}
