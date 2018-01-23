package net.juhonkoti.euler;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem3Test {

    @Test
    public void testIsPrime() {

        assertEquals(Problem3.isPrime(new BigInteger("2")), true);
        assertEquals(Problem3.isPrime(new BigInteger("3")), true);
        assertEquals(Problem3.isPrime(new BigInteger("4")), false);
        assertEquals(Problem3.isPrime(new BigInteger("5")), true);
        assertEquals(Problem3.isPrime(new BigInteger("6")), false);
        assertEquals(Problem3.isPrime(new BigInteger("7")), true);
        assertEquals(Problem3.isPrime(new BigInteger("8")), false);
        assertEquals(Problem3.isPrime(new BigInteger("9")), false);
        assertEquals(Problem3.isPrime(new BigInteger("10")), false);
        assertEquals(Problem3.isPrime(new BigInteger("11")), true);
    }

    @Test
    public void testExampleInputWorks() {

        List<BigInteger> factors;
        factors = Problem3.primeFactors(new BigInteger("12"));
        assertEquals(factors.get(0).toString(), "2");
        assertEquals(factors.get(1).toString(), "2");
        assertEquals(factors.get(2).toString(), "3");

        factors = Problem3.primeFactors(new BigInteger("147"));
        assertEquals(factors.get(0).toString(), "3");
        assertEquals(factors.get(1).toString(), "7");
        assertEquals(factors.get(2).toString(), "7");

        factors = Problem3.primeFactors(new BigInteger("13195"));
        assertEquals(factors.get(0).toString(), "5");
        assertEquals(factors.get(1).toString(), "7");
        assertEquals(factors.get(2).toString(), "13");
        assertEquals(factors.get(3).toString(), "29");
    }

    @Test
    public void printEulerQuestionAnswer() {
        List<BigInteger> factors = Problem3.primeFactors(new BigInteger("600851475143"));
        System.out.println("Question 3: Largest prime factor of the number 600851475143 is: " +
                factors.get(factors.size() -1 ));
    }
}
