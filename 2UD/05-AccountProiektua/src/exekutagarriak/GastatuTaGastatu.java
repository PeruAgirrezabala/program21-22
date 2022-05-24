/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Account;

/**
 *
 * @author agirrezabala.peru
 */
public class GastatuTaGastatu {
    public static void main(String[] args) {
        Account a1 = new Account("2095-02", "Jose el joseador", 1000);
        int zenbat=150;
        int zenbatetan=0;
        int ateratakoa=0;
        a1.toString();
        System.out.println("");
        for( zenbatetan=0;ateratakoa<1000;zenbatetan++){
            a1.setBalance(a1.getBalance()-zenbat);
            ateratakoa=ateratakoa+zenbat;
            a1.toString();
            if(zenbat>a1.getBalance()){
                System.out.printf("Triste nago; %d euro atera dut %d aldiz eta orain %d euro besterik ez zait geratzen kontuan. :-(", ateratakoa, zenbatetan, a1.getBalance());
            }
        }
    }
    
    
    
}
