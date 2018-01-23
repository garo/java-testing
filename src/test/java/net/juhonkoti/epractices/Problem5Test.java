package net.juhonkoti.epractices;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem5Test {

    @Test
    public void testSmallestMultiple() {
        assertEquals(Problem5.smallestMultiple(10), 2520);
    }

    @Test
    public void printQuestionAnswer() {
        System.out.println("Question 5: " +
                Problem5.smallestMultiple(20)
        );
    }
}
