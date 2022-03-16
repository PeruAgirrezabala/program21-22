
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
public class ProgramaNagusia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int op1 = 0;
        int op2 = 0;

        do {

            System.out.println("1 - DELETE");
            System.out.println("2 - INSERT");
            System.out.println("3 - SELECT");
            System.out.println("4 - UPDATE");
            System.out.println("5 - FIN");

            op1 = Integer.parseInt(teclado.next());

            switch (op1) {
                case 1:

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }

        }while(op1!=5);
    }
}
        
   
     
