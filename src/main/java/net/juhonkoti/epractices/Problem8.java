package net.juhonkoti.epractices;

import java.math.BigInteger;

public class Problem8 {

    public static long find(String number, int n) {


        long greatest_product = 0;
        for (int i = 0; i < number.length() - n; i++) {
            long product = 1;
            for (int j = 0; j < n; j++) {
                product *= Integer.parseInt(number.substring(i + j, i + j +1));
           }
            if (product > greatest_product) {
                greatest_product = product;
            }
        }

        return greatest_product;
    }
}
