
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
public class HolaMundo {

    public static void main(String[] args) {
        int kasuak = 0;
        Scanner in = new Scanner(System.in);
        kasuak = in.nextInt();
        in.close();
        for (int i = 0; i < kasuak; i++) {
            System.out.println("Hola mundo.");
        }
    }

}
