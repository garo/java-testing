package net.juhonkoti.epractices;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem7Test {
    @Test
    public void testFindNthPrime() {
        assertEquals(Problem7.findNthPrime(6), 13);
    }

    @Test
    public void printQuestionResponse() {
        System.out.println("Question 7: " +
                Problem7.findNthPrime(10001));

    }
}
