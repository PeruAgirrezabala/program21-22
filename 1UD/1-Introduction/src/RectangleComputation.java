/*
 * Print the area and circumference of a circle, given its radius.
 */
public class RectangleComputation {  // Save as "CircleComputation.java"
   public static void main(String[] args) {
      // Declare 3 double variables to hold radius, area and circumference.
      // A "double" holds floating-point number with an optional fractional part.
      double length, area, width, perimeter;
      // Declare a double to hold PI.
      // Declare as "final" to specify that its value cannot be changed (i.e. constant).
      
      width = 1;
      // Assign a value to radius. (We shall read in the value from the keyboard later.)
      length = 2;
      // Compute area and circumference
      area = length * width;
      perimeter = 2.0 * length + width * 2.0 ;
      
      // Print results
      System.out.print("The perimeter is ");  // Print description
      System.out.println(perimeter);          // Print the value stored in the variable
      System.out.print("The area is ");
      System.out.println(area);
      
   }
}