
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
public class LaukiBatSortu {
    public static void main(String[] args) {
        
        int zab=0,alt=0;
        Laukia l1= new Laukia();
        Scanner in=new Scanner(System.in);
        System.out.println("Sartu ezazu laukiaren zabalera");
        zab=in.nextInt();
        System.out.println("Sartu ezazu laukiaren altuera");
        alt=in.nextInt();
        in.close();
        System.out.println("Hona hemen laukia beterik");
        l1.marraztuBeteta(zab,alt);
        
            System.out.println("Hona hemen laukia hutsik");
        l1.marraztuHutsik(alt, zab);
    }
    
}
