package Tests.January_26_2022;

import java.util.Scanner;

public class MockTest3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(palindromeIndex(s));
    }

    public static int palindromeIndex(String s) {
        // Write your code here
        int first = 0;
        int last = s.length() - 1;

        StringBuilder sb = new StringBuilder(s);

        if(!checkPalindrome(s)) {

            while (first < last) {

                if (s.charAt(first) != s.charAt(last)) {
                    sb.deleteCharAt(first);
                    if(checkPalindrome(sb.toString())) {
                        return first;
                    } else {
                        StringBuilder sb1 = new StringBuilder(s);
                        sb1.deleteCharAt(last);
                        if(checkPalindrome(sb1.toString())) {
                            return last;
                        }
                    }
                }

                first++;
                last--;
            }
        }

        return -1;
    }

    public static boolean checkPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        while(first < last) {

            if(s.charAt(first) != s.charAt(last)) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}
