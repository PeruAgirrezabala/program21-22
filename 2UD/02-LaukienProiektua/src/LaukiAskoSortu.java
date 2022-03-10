
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agirrezabala.peru
 */
public class LaukiAskoSortu {

    public static void main(String[] args) {
        final int zenbat;
        int[] laukienArraya;
        int kopurua, x = 1;
        System.out.print("zenbat laukia nahi dituzu?");
        Scanner in = new Scanner(System.in);
        kopurua = in.nextInt();
        zenbat = kopurua;
        laukienArraya = new int[zenbat];
        for (int i = 0; i < kopurua; i++) {
            System.out.print(x + ". Laukiko datuak:");
            System.out.print("Zabelera-->");
            laukienArraya[i] = in.nextInt();
            System.out.print("Altuera-->");
            laukienArraya[i] = in.nextInt();
            x++;
        }
        System.out.println("Laukia  Zabalera  Altuera  Azalera  Perimetroa  Mota ");
        System.out.println("=====================================================");
        int a=1;
        for (int i = 0; i < kopurua; i++) {
   //        System.out.printf("%4d%4d%4d%4d%4d%4d ",a, i.getZabalera(), i.getAltuera(),i.getAzalera(),i.getPerimetroa(), i.getMota());

        }
    }
}

