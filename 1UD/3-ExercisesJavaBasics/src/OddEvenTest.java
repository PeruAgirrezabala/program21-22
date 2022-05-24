
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
public class OddEvenTest {

    public static void main(String[] args) {
        int number = 1;

        for (int i = number; i > 0; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
                number = in.nextInt();
                if(isOdd(number)){
                    System.out.println(" is odd");
                    
                }else{
                    System.out.println("is even");
                }
        }
    }




public static boolean isOdd(int number){
    boolean isOdd= false;
   if(number%2!=0){
    isOdd=true;
}
 return isOdd;
}  
}