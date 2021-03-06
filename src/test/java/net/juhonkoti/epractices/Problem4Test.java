package net.juhonkoti.epractices;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem4Test {

    @Test
    public void testIsPalindrome() {


        assertEquals(Problem4.isPalindrome("foo"), false);
        assertEquals(Problem4.isPalindrome("foof"), true);
        assertEquals(Problem4.isPalindrome("1122"), false);
        assertEquals(Problem4.isPalindrome("11211"), true);
        assertEquals(Problem4.isPalindrome("1"), true);
        assertEquals(Problem4.isPalindrome("12321"), true);

    }

    @Test
    public void testLargestPalindromeProduct() {
        assertEquals(Problem4.largestPalindromeProduct(2), 9009);
    }

    @Test
    public void printQuestionResponse() {
        System.out.println("Question 4: " +
                Problem4.largestPalindromeProduct(3));

    }

}
