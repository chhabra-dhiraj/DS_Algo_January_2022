package TimeAndSpaceComplexity_January_23_2022;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        bubbleSort(arr);
        print(arr);
    }

    public static void bubbleSort(int[] arr) {
        if(arr.length <= 1) {
            return;
        }

        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (isSmaller(arr[i], arr[i + 1])) {
                    swap(arr, i);
                }
            }
        }

    }

    public static boolean isSmaller(int first, int second) {
        System.out.println("Comparing " + second + " and " + first);
        return first > second;
    }

    public static void swap(int[] arr, int i) {
        System.out.println("Swapping " + arr[i + 1] + " and " + arr[i]);
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}