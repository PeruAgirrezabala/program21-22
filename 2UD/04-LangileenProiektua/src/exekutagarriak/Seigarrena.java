/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Langilea;
import java.util.Scanner;

/**
 *
 * @author agirrezabala.peru
 */
public class Seigarrena {

    public static void main(String[] args) {
        String izena;
        int portzentaia;
        double nomina = 0;
        double haundiena=0;
        Langilea[] langileak = Langilea.nireHamarLagunLangile();
        System.out.println("ID    IZENA             ABIZENA    SOLDATA");
        System.out.println("==========================================");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d %-10s %15s %8.2f\n", langileak[i].getId(), langileak[i].getIzena(), langileak[i].getAbizena(), langileak[i].getSoldata());
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Sartu bistaratu nahi duzun langilearen izena");
        izena = in.nextLine();
        if (Langilea.bilatu(langileak, izena) == null) {
            System.out.println("Ez dago langilerik horrelako izenarekin");

        } else {
            System.out.println(Langilea.bilatu(langileak, izena));
            System.out.println("Sartu ezazu soldataren igoeraren ehunekoa");
            portzentaia = in.nextInt();
            (Langilea.bilatu(langileak, izena)).soldataIgo(portzentaia);
        }

        System.out.println("ID    IZENA             ABIZENA    SOLDATA");
        System.out.println("==========================================");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d %-10s %15s %8.2f\n", langileak[i].getId(), langileak[i].getIzena(), langileak[i].getAbizena(), langileak[i].getSoldata());
        }
        for (int i = 0; i < 10; i++) {
            nomina = nomina + langileak[i].getUrtekoSoldata();


        }
        System.out.printf("Enpresak urtean nominetan gastatuko duena-->%9.2f\n", nomina);
        for(int i=0;i<langileak.length;i++){
            if(langileak[i].getSoldata()>haundiena){
                haundiena=langileak[i].getSoldata();
                izena=langileak[i].getIzena();
            }
        }
        System.out.println("Soldata haundiena duen langilea--> "+Langilea.bilatu(langileak, izena));
        in.close();
    }
}
