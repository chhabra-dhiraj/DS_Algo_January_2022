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
            System.out.print("_\t");
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            for (int size = 0; size < arr.length - i; size++) {

                if(size != 0) {
                    for (int k = i + 1; k < arr.length; k++) {
                        int j = 0;
                        while (j < arr.length) {
                            if (j == i) {
                                System.out.print(arr[j] + "\t");
                            } else if (size > 0 && j >= k && j - i <= size) {
                                System.out.print(arr[j] + "\t");
                            } else {
                                System.out.print("_\t");
                            }
                            j++;
                        }
                        System.out.println();
                    }
                } else {
                    int j = 0;
                    while (j < arr.length) {
                        if (j == i) {
                            System.out.print(arr[j] + "\t");
                        } else if (size > 0 && j > i && j - i <= size) {
                            System.out.print(arr[j] + "\t");
                        } else {
                            System.out.print("_\t");
                        }
                        j++;
                    }
                    System.out.println();
                }
            }
        }

    }
}
