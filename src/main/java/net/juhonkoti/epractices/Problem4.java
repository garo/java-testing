package net.juhonkoti.epractices;

public class Problem4 {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }

        return true;
    }

    // https://projecteuler.net/problem=4
    public static int largestPalindromeProduct(int digits) {

        int limit = ((int) Math.pow(10, digits));

        int largest = 0;
        for (int i = 1; i < limit; i++) {
            for (int j = 1; j < limit; j++) {
                int product = i * j;
                if (isPalindrome(Integer.toString(product)) && product > largest) {
                    largest = product;
                }
            }
        }

        return largest;
    }
}
