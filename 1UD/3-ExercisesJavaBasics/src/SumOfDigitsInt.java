import java.util.Scanner;   // For keyboard input
public class SumOfDigitsInt  {
    public static void main(String[] args) {
          // Declare variables
      int inNumber;   // to be input
      int inDigit, sum=0;    // each digit
      
      
       Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter a popsitive integer: ");  // No newline for prompting message
        inNumber = in.nextInt();
        in.close();  // Close Scanner

      // Extract and drop the "last" digit repeatably using a while-loop with modulus/divide operations
      while (inNumber > 0) {
         inDigit = inNumber % 10; // extract the "last" digit
         // Print this digit (which is extracted in reverse order)
         
         inNumber /= 10; 
         sum= sum+inDigit;
      }
      System.out.println("The sum of all digits is: "+ sum);
    }
    
}
