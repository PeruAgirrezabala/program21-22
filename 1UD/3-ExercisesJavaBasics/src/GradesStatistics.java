import java.util.Scanner;
public class GradesStatistics {
    public static void main(String[] args) {
           // Declare variables
      final int NUM_STUDENTS;
      int[] marks;  // Declare array name, to be allocated after NUM_ITEMS is known
      
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            NUM_STUDENTS = in.nextInt();
            marks= new int[NUM_STUDENTS];
            System.out.append("Enter the value of all items (separated by space):");
           if (marks.length > 0) {
         System.out.print("Enter the value of all items (separated by space): ");
         for (int i = 0; i < marks.length; ++i) {
            marks[i] = in.nextInt();
         }
           }
    }
}