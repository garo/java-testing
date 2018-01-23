package net.juhonkoti.epractices;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem1Test {


    @Test
    public void testExampleInputWorks() {
        assertEquals(Problem1.calculateSimple(10), 23);

        assertEquals(Problem1.calculateStreams(10), 23);
    }

    @Test
    public void printQuestionResponse() {
        System.out.println("Question 1: " + Problem1.calculateSimple(1000));

    }
}
