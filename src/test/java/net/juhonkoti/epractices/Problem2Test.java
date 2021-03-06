package net.juhonkoti.epractices;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Problem2Test {

    @Test
    public void testExampleInputWorks() {

        List<Integer> result = Problem2.fibbonacci(10);
        assertThat(result, CoreMatchers.hasItems(1,2,3,5,8,13,21,34,55,89));

    }

    @Test
    public void testQuestionWorks() {
        int sum = Problem2.eulerQuestion(50);
        assertEquals(sum, 2+8+34);
    }


    @Test
    public void printAnswer() {
        System.out.println("Question 2 answer: " + Problem2.eulerQuestion(4000000));
    }
}
