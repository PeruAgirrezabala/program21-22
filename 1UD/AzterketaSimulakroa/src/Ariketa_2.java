
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
public class Ariketa_2 {

    public static void main(String[] args) {
        String[] izenak = {"Jon", " Jone", "June", " Julian", " Julen"};   // input String
        String bilatua;
        Scanner in = new Scanner(System.in);
        System.out.print("Noren bila zaude? ");
        bilatua = in.next();
        in.close();
        for (int i = 0; i < izenak.length; i++) {
            if (izenak[i].equals(bilatua)) {
                System.out.println("Bilatzen ari zaren pertsona zerrendako" + (i + 1) + " da");
                break;

            }
            if (!izenak[i].equals(bilatua) && i > 4) {
                System.out.printf("Bilatzen ari zaren pertsona ez da zerrendan aurkitzen");
                break;

            }

        }

    }
}
