package net.juhonkoti.epractices;

public class Problem7 {

    public static boolean isPrime(long number) {
        for (long i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static long findNthPrime(int nth) {

        int found = 0;
        int i = 1;
        do {
            i++;
            if (isPrime(i)) {
                found++;
            }
        } while (found < nth);

        return i;
    }
}
