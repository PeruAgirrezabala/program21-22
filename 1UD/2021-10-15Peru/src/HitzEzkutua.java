
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
public class HitzEzkutua {

    public static void main(String[] args) {
        String hitza = "udazkena";
        String karakterea;
        int hitzaLen;
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu karaktere bat: ");
        karakterea = in.next();
        hitzaLen = hitza.length();
        in.close();
        for (int inCharIdx = 0; inCharIdx <= hitzaLen - 1; inCharIdx++) {
            if (hitza.charAt(inCharIdx) == karakterea.charAt(0)) {
                System.out.print(karakterea);

            } else {
                System.out.print("-");
            }
        }
    }

}
