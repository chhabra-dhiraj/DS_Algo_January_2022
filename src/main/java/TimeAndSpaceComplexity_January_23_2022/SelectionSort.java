package TimeAndSpaceComplexity_January_23_2022;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        selectionSort(arr);
        print(arr);
    }

    public static void selectionSort(int[] arr) {

        if(arr.length <= 1) {
            return;
        }

        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(isSmaller(arr, min, j)) {
                   min = j;
                }
            }
            if(min != i) {
                swap(arr, i, min);
            }
        }
    }

    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[j] + " and " + arr[i]);

        if(arr[i] > arr[j]) {
            return true;
        }

        return false;
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[j] + " and " + arr[i]);

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
