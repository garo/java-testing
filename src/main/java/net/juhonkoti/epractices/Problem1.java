package net.juhonkoti.epractices;

import java.util.stream.IntStream;

public class Problem1 {

    // Naive procedural implementation
    public static int calculateSimple(int below) {

        int sum = 0;
        for (int i = 1; i < below; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }

        return sum;
    }

    public static int calculateStreams(int below) {
        return IntStream.range(1, below).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
    }
}
