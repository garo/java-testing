package net.juhonkoti.euler;

public class Problem6 {

    public static long sumSquareDifference(int number) {

        int sum_of_squares = 0;
        long square_of_sums = 0;
        for (int i = 1; i <= number; i++) {
            sum_of_squares += Math.pow(i, 2);
            square_of_sums += i;
        }

        square_of_sums = (long) Math.pow(square_of_sums, 2);

        return square_of_sums - sum_of_squares;


    }
}
