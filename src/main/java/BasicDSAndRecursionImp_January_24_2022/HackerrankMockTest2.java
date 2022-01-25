package BasicDSAndRecursionImp_January_24_2022;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerrankMockTest2 {

    public static void main(String[] args) throws Exception {
        ArrayList<List<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        matrix.add(row1);
        ArrayList<Integer> row2 = new ArrayList<>();
        matrix.add(row2);
        ArrayList<Integer> row3 = new ArrayList<>();
        matrix.add(row3);
        ArrayList<Integer> row4 = new ArrayList<>();
        matrix.add(row4);

        row1.add(112);
        row1.add(42);
        row1.add(83);
        row1.add(119);
        row2.add(56);
        row2.add(125);
        row2.add(56);
        row2.add(49);
        row3.add(15);
        row3.add(78);
        row3.add(101);
        row3.add(43);
        row4.add(62);
        row4.add(98);
        row4.add(114);
        row4.add(108);

        System.out.println(flippingMatrix(matrix));
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        for(int i = 0; i < matrix.size(); i++) {
            Collections.sort(matrix.get(i), Collections.reverseOrder());
        }

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < matrix.size(); i++) {
            int pairSum = 0;
            for(int j = 0; j < matrix.get(0).size() / 2; j++) {
                pairSum += matrix.get(i).get(j);
            }
            temp.add(pairSum);
        }

        System.out.println(matrix);

        Collections.sort(temp, Collections.reverseOrder());
        System.out.println(temp);

        int sum = 0;
        for(int i = 0; i < temp.size() / 2; i++) {
            sum += temp.get(i);
        }

        return sum;
    }

}
