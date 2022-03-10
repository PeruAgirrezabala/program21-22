/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Langilea;
import model.Zatikia;

/**
 *
 * @author agirrezabala.peru
 */
/*public class Zortzigarrena {
    public static void main(String[] args) {
        double astekoOrduak=0;
        int lanorduak=35;
        Langilea[] langileak = Langilea.nireHamarLagunLangile();
        Zatikia lanaldiberria = new Zatikia ("1/2");
        langileak[0].setLanaldia(lanaldiberria);
        langileak[9].setLanaldia(lanaldiberria);
        for(int i=0; i<langileak.length; i++){
            astekoOrduak+=((langileak[i].getLanaldia()).hamartarBaliokidea()) * 35;
        }
         System.out.println(astekoOrduak);
    }
     
}*/
public class Zortzigarrena {
    public static void main(String[] args) {
        double astekoOrduak=0;
        Langilea[]langileak = Langilea.nireHamarLagunLangile();
        Zatikia lanaldiErdia = new Zatikia (2,1);
        langileak[0].setLanaldia(Zatikia.biderkatu(langileak[0].getLanaldia(), lanaldiErdia));
        langileak[9].setLanaldia(Zatikia.biderkatu(langileak[9].getLanaldia(), lanaldiErdia));
        for(int i = 0; i < langileak.length; i++){
            astekoOrduak += ((langileak[i].getLanaldia()).hamartarBaliokidea()) * 35;
        }
        System.out.println(astekoOrduak);
    }
}
