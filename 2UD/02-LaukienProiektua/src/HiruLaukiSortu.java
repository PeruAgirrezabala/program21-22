/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agirrezabala.peru
 */
public class HiruLaukiSortu {
    public static void main(String[] args) {
        Laukia l1= new Laukia(5,1);
        Laukia l2= new Laukia(6,2);
        Laukia l3= new Laukia(2,2);
        System.out.println("l1 "+l1.toString());
        System.out.println("l2 "+l2.toString());
        System.out.println("l3 "+l3.toString());
        System.out.println("l1 "+l1.getMota());
        System.out.println("l2 "+l2.getMota());
        System.out.println("l3 "+l3.getMota());

        
    }
    
}
