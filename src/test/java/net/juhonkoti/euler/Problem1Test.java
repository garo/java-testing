package net.juhonkoti.euler;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem1Test {


    @Test
    public void testExampleInputWorks() {
        assertEquals(Problem1.calculateSimple(10), 23);

        assertEquals(Problem1.calculateStreams(10), 23);
    }

    @Test
    public void printEulerQuestionResponse() {
        System.out.println("Question 1: Multiples of 3 or 5 below 1000: " + Problem1.calculateSimple(1000));

    }
}
