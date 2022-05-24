import java.util.Scanner;
public class printArrayInStars {
    public static void main(String[] args) {
           // Declare variables
      final int NUM_ITEMS;
      int[] items;  // Declare array name, to be allocated after NUM_ITEMS is known
      
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of items: ");
            NUM_ITEMS = in.nextInt();
            items= new int[NUM_ITEMS];
            System.out.append("Enter the value of all items (separated by space):");
           if (items.length > 0) {
         System.out.print("Enter the value of all items (separated by space): ");
         for (int i = 0; i < items.length; ++i) {
            items[i] = in.nextInt();
         }
      

      // Print array in "index: number of stars" using a nested-loop
      // Take note that rows are the array indexes and columns are the value in that index
      for (int idx = 0; idx < items.length; ++idx) {  // row
         System.out.print(idx + ": ");
         // Print value as the number of stars
         for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
            System.out.print("*");
            if(starNo== items[idx]){
                 System.out.printf("(%d)", starNo);
            }
         }
        
         System.out.println();
      }
    }
    
}
}
