/**
 * Trying nested-if and switch-case statements.
 */
public class PrintDayInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int dayNumber = 100;  // Set the value of "number" here!
 
      // Using nested-if
      if ( dayNumber == 1) {   // Use == for comparison
         System.out.println( "MONDAY" );
      } else if ( dayNumber == 2 ) {
         System.out.println( "TUESDAY" );
      } else if ( dayNumber == 3  ) {
         System.out.println( "WEDNESDAY" );
      } else if ( dayNumber == 4 ) {
          System.out.println( "THURSDAY" );
      }else if ( dayNumber == 5 ) {
          System.out.println( "FRIDAY" );
      }else if ( dayNumber == 6 ) {
          System.out.println( "SATURDAY" );
      }else if ( dayNumber == 7 ) {
          System.out.println( "SUNDAY" );
      }else 
          System.out.println( "OTHER" );
 
      // Using switch-case-default
       switch (dayNumber) {
           case 1:
               System.out.println("MONDAY");
               break;  // Don't forget the "break" after each case!
           case 2:
               System.out.println("TUESDAY");
               break;
           case 3:
               System.out.println("WEDNESDAY");
               break;
           case 4:
               System.out.println("THURSDAY");
               break;
           case 5:
               System.out.println("FRIDAY");
               break;
           case 6:
               System.out.println("SATURDAY");
               break;
           case 7:
               System.out.println("SUNDAY");
               break;

           default:
               System.out.println("OTHER"); 
      }
   }
}
