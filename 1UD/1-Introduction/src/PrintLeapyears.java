/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agirrezabala.peru
 */
public class PrintLeapyears {

    public static void main(String[] args) {
        final int LOWERBOUND = 999;
        final int UPPERBOUND = 2010;
        int count = 0;

        int year = LOWERBOUND;
        while (year <= UPPERBOUND) {
            if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
                 System.out.println(year);
                 ++count;
               

            }
            ++year;

           
        }
        System.out.println("there are " + count + " leap years from " + LOWERBOUND + " to " + UPPERBOUND );
    }
    

}
    

