
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
public class GradesStatisticsArray {

    public static void main(String[] args) {
        int numStudents;
        int[] marks;
        double average = 0;
        int max = 0, min = 101;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();
        marks = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            new Scanner(System.in);
            System.out.print("Enter the mark: ");
            marks[i] = in.nextInt();
            if (marks[i] > 100) {
                System.out.println("Invalid mark, repeat the proccess");
                break;
            } else {
                average = average + marks[i];
                if (marks[i] < min) {
                    min=marks[i];
                }
                else if (marks[i] > max) {
                    max=marks[i];
                }

            }
            if (i == numStudents-1) {
                average = average / numStudents;
                System.out.printf("The average is: %.2f", average);
                System.out.printf("The maximun is: %d", max);
                System.out.printf("The minimun is: %d", min);
            }
        }

    }

}
