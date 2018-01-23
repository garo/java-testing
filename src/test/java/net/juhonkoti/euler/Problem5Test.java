package net.juhonkoti.euler;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem5Test {

    @Test
    public void testSmallestMultiple() {
        assertEquals(Problem5.smallestMultiple(10), 2520);
    }

    @Test
    public void printEulerQuestionAnswer() {
        System.out.println("Smallest positive number that is evenly divisible by all of the numbers from 1 to 20: " +
                Problem5.smallestMultiple(20)
        );
    }
}
