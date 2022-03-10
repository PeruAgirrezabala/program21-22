
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
public class AverageWithInputValidation {

    public static void main(String[] args) {
        // Declare constant
        final int NUM_STUDENTS = 3;

        // Declare variables
        int numberIn;
        boolean isValid;   // boolean flag to control the input validation loop
        int sum = 0;
        double average = 0;
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            // Prompt user for mark with input validation

            isValid = false;   // reset assuming input is not valid
            do {
                System.out.print("Enter a number between 0-100: ");  // No newline for prompting message
                numberIn = in.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                     isValid=true;
                } else {
                    System.out.println("invalid input try again...");
                }

            } while (!isValid);

            sum += numberIn;
            average = (double) sum / NUM_STUDENTS;
        }
        System.out.printf("the average mark is: %.2f%n", average);
        in.close();  // Close Scanner
    }

}
