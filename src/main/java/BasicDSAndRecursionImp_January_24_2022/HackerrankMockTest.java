package BasicDSAndRecursionImp_January_24_2022;

import java.util.*;

public class HackerrankMockTest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int temp = scn.nextInt();
            arr.add(temp);
        }

        System.out.println(findMedian(arr));
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        for(int i = 0; i < arr.size() - 1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.size(); j++) {
                if(isSmaller(arr, min, j)) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }

        return arr.get(arr.size() / 2);
    }

    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static boolean isSmaller(List<Integer> arr, int i, int j) {
        if(arr.get(i) > arr.get(j)) {
            return true;
        }

        return false;
    }
}
