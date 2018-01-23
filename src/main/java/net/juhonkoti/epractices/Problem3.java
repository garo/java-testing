package net.juhonkoti.epractices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    public static boolean isPrime(BigInteger number) {
        for (BigInteger i = new BigInteger("2"); i.compareTo(number) == -1; i = i.add(BigInteger.ONE) ) {
            if (number.remainder(i) == BigInteger.ZERO)
                return false;
        }

        return true;
    }

    public static List<BigInteger> primeFactors(BigInteger number) {

        ArrayList<BigInteger> primes = new ArrayList<BigInteger>();

        for (BigInteger i = new BigInteger("2"); i.compareTo(number) <= 0; i = i.add(BigInteger.ONE) ) {
            if (isPrime(i)) {
                if (number.remainder(i) == BigInteger.ZERO) {
                    primes.add(i);
                    primes.addAll(primeFactors(number.divide(i)));
                    return primes;
                }
            }
        }

        return primes;
    }
}
