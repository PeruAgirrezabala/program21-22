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
public class EscudosDelEjercitoRomano {
         public static void main(String[] args) {

        final Scanner s = new Scanner(System.in);
        int ejercito, total, temp;

        while (true) {
            ejercito = s.nextInt();
            if (ejercito == 0) break;
            total = 0;
            while (true) {
                if (ejercito == 0) break;
                if (ejercito < 4) { total += ejercito * 5; break; }
                temp = (int) Math.sqrt(ejercito);
                ejercito -= (temp * temp);
                total += (temp - 2) * (temp - 2); //interior
                total += (((temp - 2) * 4) * 2) + 12; // exterior + esquinas
            }
            System.out.println( total );
        }

    }

}
