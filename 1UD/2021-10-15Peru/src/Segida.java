
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
public class Segida {

    public static void main(String[] args) {
        int zenbakia = 0, multzoa = 0, hasierakoMultzoa;
        System.out.print("zein da inprimatu nahi duzun azken zenbakia?");
        Scanner in = new Scanner(System.in);
        zenbakia = in.nextInt();
        System.out.print("Zenbat zenbakiko multzoak nahi dituzu?");
        multzoa = in.nextInt();
        hasierakoMultzoa = multzoa;
        for (int i = 1; zenbakia >= i; i++) {
            System.out.println(i);
            if (i == multzoa) {
                System.out.println("=====");
                multzoa = multzoa + hasierakoMultzoa;

            }
        }

    }

}
