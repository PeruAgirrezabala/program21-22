
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agirrezabala.peru
 */
public class BoxPatternE {
    public static void main(String[] args) {
        
        
        
              final int size;   // size of table to be input

      // Prompt for size and read input as "int"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the size: ");
      size = in.nextInt();
      in.close();
         // Outer loop to print each of the rows
      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
         // Inner loop to print each of the columns of a particular row
         for (int col = 1; col <= size; col++) {
             // col = 1, 2, 3, ..., size
            if (row == 1 || row == size ||  col == row || row+col==1+size || col==1 ||col== size) {
                System.out.print("# ");
            } else {
                System.out.print("  ");  // Need to print the "leading" blanks
            }
         }
         // Print a newline after printing all the columns
         System.out.println();
      }
    }
}