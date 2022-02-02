package Tests.February_1_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MockTest5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr.add(arrItem);
        }

        System.out.println(pairs(k, arr));

    }

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        int pairNum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(Math.abs(arr.get(i) - arr.get(j)) == k) {
                    pairNum++;
                    break;
                } else if(Math.abs(arr.get(i) - arr.get(j)) > k){
                    break;
                }
            }
        }

        return pairNum;
    }

}
