package net.juhonkoti.epractices;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem9Test {

    @Test
    public void testExampleValue() {

        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000; b++) {
                for (int c = a; c < 1000; c++) {
                    if (Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        //System.out.println("found:" + a + ", " + b + ", " + c);
                        if (a + b + c == 1000) {
                            System.err.println("Problem 9 answer is: " + (a*b*c));
                        }
                    }
                }
            }
        }
    }


}
