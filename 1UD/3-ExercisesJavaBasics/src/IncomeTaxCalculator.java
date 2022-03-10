import java.util.Scanner;   // For keyboard input
/**
 *
 * @author agirrezabala.peru
 */
public class IncomeTaxCalculator {
    public static void main(String[] args) {
          // Declare constants first (variables may use these constants)
      // The keyword "final" marked these as constant (i.e., cannot be changed).
      // Use uppercase words joined with underscore to name constants
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

      // Declare variables
      int taxableIncome;
      double taxPayable;
      
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter first integer: ");  // No newline for prompting message
        taxableIncome = in.nextInt();
        in.close();

      // Compute tax payable in "double" using a nested-if to handle 4 cases
      if (taxableIncome <= 20000) {         // [0, 20000]
         taxPayable = 0;
      } else if (taxableIncome <= 40000) {  // [20001, 40000]
         taxPayable = taxableIncome*TAX_RATE_ABOVE_20K;
      } else if (taxableIncome <= 60000) {  // [40001, 60000]
         taxPayable = taxableIncome*TAX_RATE_ABOVE_40K+20000*0.1;
      } else {                             // [60001, ]
         taxPayable = TAX_RATE_ABOVE_60K*taxableIncome+20000*TAX_RATE_ABOVE_40K+20000*TAX_RATE_ABOVE_20K;
      }
      // Alternatively, you could use the following nested-if conditions
      // but the above follows the table data
      //if (taxableIncome > 60000) {          // [60001, ]
      //   ......
      //} else if (taxableIncome > 40000) {   // [40001, 60000]
      //   ......
      //} else if (taxableIncome > 20000) {   // [20001, 40000]
      //   ......
      //} else {                              // [0, 20000]
      //   ......
      //}

      // Print results rounded to 2 decimal places
      System.out.printf("The income tax payable is: $%.2f%n",taxPayable );
        
    }
    
}
