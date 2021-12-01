/*
    (Square numbers) Find the first ten square numbers that are greater than
    Long.MAX_VALUE. A square number is a number in the form of n2. For example, 4,
    9, and 16 are square numbers. Find an efficient approach to run your program fast.

    @author: Eric Ramsey
    @version: 03/17/21
 */

import java.math.BigDecimal;

public class Exercise10_17 {

    public static void main(String[] args) {

        BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE);

        BigDecimal newNumber = new BigDecimal(start);
        int counter = 0;

       while (counter < 10) {

           BigDecimal squaredNumber = newNumber.multiply(newNumber);
           if (squaredNumber.compareTo(longMaxValue) > 0) {

               counter++;
               System.out.println(counter + ": " + newNumber + "squared = " + squaredNumber);

           }
           newNumber = newNumber.add(BigDecimal.ONE);
       }
    }
}
