package Inteview_Liebherr;

import java.util.Scanner;

public class Turning_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(turningNumber(arr));
    }

    public static int turningNumber(int[] arr) {
        for(int i = 1; i < arr.length - 1; i++) {
            int first = 0;
            int last = arr.length - 1;

            while(true) {
                if(first == last) {
                    return i;
                }

                if(first != i && arr[first] < arr[first + 1]) {
                    break;
                }

                if(last != i && arr[last - 1] > arr[last] ) {
                    break;
                }

                if(first != i) {
                    first++;
                }

                if(last != i) {
                    last--;
                }
            }
        }

        return -1;
    }
}
