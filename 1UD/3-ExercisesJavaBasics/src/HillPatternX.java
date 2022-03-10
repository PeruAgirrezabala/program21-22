
import java.util.Scanner;
public class HillPatternX {
    public static void main(String[] args) {
        final int size;   // size of table to be input

      // Prompt for size and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();
       
      for (int row = 1; ) {
         // numCol = 2*numRows - 1
         for (int col = 1; ......) {
            if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
               ......;
            } else {
               ......;
            }
         }
         ......;
      }
        
    }
}
