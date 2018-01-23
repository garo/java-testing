package net.juhonkoti.epractices;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static List<Integer> fibbonacci(int count) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(count);

        int t1 = 1, t2 = 2;
        numbers.add(1);
        numbers.add(2);
        for (int i = 2; i < count; i++) {
            numbers.add(t1 + t2);
            int tmp = t2;
            t2 = t1 + t2;
            t1 = tmp;
        }

        return numbers;
    }

    // https://projecteuler.net/problem=2
    public static int eulerQuestion(int max) {
        int sum = 2;
        int t1 = 1, t2 = 2;
        int m;
        do {
            m = t1 + t2;
            t1 = t2;
            t2 = m;

            if (m % 2 == 0) {
                sum += m;
            }
        } while (m < max);

        return sum;
    }
}
