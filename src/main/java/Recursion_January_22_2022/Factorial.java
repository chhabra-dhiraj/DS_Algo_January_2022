package Recursion_January_22_2022;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n == 0) {
            return 1;
        }

        int result = n * factorial(n - 1);

        return result;
    }

}
