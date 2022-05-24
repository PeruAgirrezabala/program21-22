import java.util.Scanner;   // For keyboard input

/**
 *
 * @author agirrezabala.peru
 */
public class Swap2Integers {
    public static void main(String[] args) {
        int x, y,temp;
        
         Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter first integer: ");  // No newline for prompting message
        x = in.nextInt();
        


        new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter second integer: ");  // No newline for prompting message
        y = in.nextInt();
        in.close();  // Close Scanner
        
        temp = y;
        y = x;
        x = temp;
        
        System.out.println("The first interger is: "+x);
        System.out.println("The second interger is: "+y);
        
        
        

        
    }
    
}
