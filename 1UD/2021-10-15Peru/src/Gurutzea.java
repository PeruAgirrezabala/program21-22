
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
public class Gurutzea {

    public static void main(String[] args) {

        final int size;   // size of table to be input

        // Prompt for size and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Zein neurritako gurutzea marraztu nahi duzu (zenbaki bakoitia sartu)? ");
        size = in.nextInt();
        in.close();
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                if (col == (size / 2) + 1 || row == (size / 2) + 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("· ");
                }
            }
            // Print a newline after printing all the columns
            System.out.println();
        }
    }
}
    
