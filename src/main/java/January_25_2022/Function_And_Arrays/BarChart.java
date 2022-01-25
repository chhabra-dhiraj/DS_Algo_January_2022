package January_25_2022.Function_And_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        barChart(a);
    }

    public static void barChart(int[] a) {
        int m = max(a);
        for(int i = m; i > 0; i--) {
            for(int j = 0; j < a.length; j++) {
                if(i > a[j]) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

    public static int max(int[] a) {
        if(a.length == 0) {
            return -1;
        } else if(a.length == 1) {
            return a[0];
        }

        int max = a[0];

        for(int i = 1; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }
}
