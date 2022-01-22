package Recursion_January_22_2022;

import java.util.Scanner;

public class PDI {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    private static void pdi(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }

}
