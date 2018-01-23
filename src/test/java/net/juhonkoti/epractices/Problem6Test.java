package net.juhonkoti.epractices;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem6Test {

    @Test
    public void testSumSquareDifference() {
        assertEquals(Problem6.sumSquareDifference(10), 2640);
    }

    @Test
    public void printQuestionAnswer() {
        System.out.println("Question 6: " +
                Problem6.sumSquareDifference(100)
        );
    }

}
