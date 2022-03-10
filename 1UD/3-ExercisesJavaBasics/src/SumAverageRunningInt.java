/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum = sum +number;     // same as "sum = sum + number"
      }
      average = (double)sum/ UPPERBOUND ;
      
// Compute average in double. Beware that int / int produces int!
      System.out.println("The sum of 1 to 100 is "+ sum);
      System.out.println("The average is  "+ average);
      // Print sum and average
      
   }
}