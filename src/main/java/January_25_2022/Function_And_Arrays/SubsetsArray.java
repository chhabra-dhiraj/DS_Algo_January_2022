package January_25_2022.Function_And_Arrays;

import java.util.Scanner;

public class SubsetsArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        subsets(arr);
    }

    public static void subsets(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            straightSets(i, arr);
        }
    }

    public static void straightSets(int index, int[] arr) {
        int level = 0;
        for(int i = index; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(j >=index && j < arr.length - level) {
                    System.out.print(arr[j] + "\t");
                } else {
                    System.out.print("_\t");
                }
            }
            level++;
            System.out.println();
        }
    }
}
