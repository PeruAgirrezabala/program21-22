/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agirrezabala.peru
 */
public class ThreeFiveSevenSum {
    public static void main (String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) { //3 5 edo 7ren multiploa bada
                if ( number % 15 == 0 || number % 21 == 0 || number % 35 == 0 | number % 105 == 0) { // 15 21 35 edo 105 multiploa bada
                // ez dugu ezer egingo
            }else{
               //System.out.println(number);
               sum= sum + number;
        }
    }
    ++number;
  }
        System.out.println("zenbakien batura:"+ sum);
    }        
    
}   
    
    
    
    
    
    

