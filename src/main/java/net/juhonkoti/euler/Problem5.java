package net.juhonkoti.euler;

public class Problem5 {

    public static int smallestMultiple(int maxDivider) {

        int number = 1;
        do {
            boolean all_dividable = true;
            for (int i = 1; i <= maxDivider; i++) {
                if (number % i != 0) {
                    all_dividable = false;
                    break;
                }
            }
            if (all_dividable && (number % 2 == 0)) {
                return number;
            }
            number++;
        } while (true);
    }
}
