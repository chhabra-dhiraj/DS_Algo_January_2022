package Tests.February_1_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MockTest4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> petrolpumps = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            List<Integer> petrolpumpsRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int petrolpumpsItem = scanner.nextInt();
                petrolpumpsRowItems.add(petrolpumpsItem);
            }

            petrolpumps.add(petrolpumpsRowItems);
        }

        System.out.println(truckTour((petrolpumps)));
    }

    public static int truckTour(List<List<Integer>> petrolpumps) {

        if(petrolpumps.size() == 1) {
            return 0;
        }

        // Write your code here
        for (int i = 0; i < petrolpumps.size(); i++) {
            int j = i;
            int z = petrolpumps.size();
            int petrol = 0;
            while (j < z) {
                petrol = petrol + petrolpumps.get(j).get(0);
                if (petrol < petrolpumps.get(j).get(1)) {
                    break;
                }

                if (i == 0 && j == petrolpumps.size() - 1) {
                    return i;
                } else if (j == i - 1) {
                    return i;
                }

                petrol = petrol - petrolpumps.get(j).get(1);

                if (j == petrolpumps.size() - 1) {
                    j = 0;
                    z = i;
                } else {
                    j++;
                }

            }
        }

        return -1;
    }
}
