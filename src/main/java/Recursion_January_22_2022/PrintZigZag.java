package Recursion_January_22_2022;

import java.util.Scanner;

public class PrintZigZag {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
    }

    public static void pzz(int n) {
        if(n == 1) {
            System.out.print("1 1 1 ");
            return;
        }

        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
    }
}
