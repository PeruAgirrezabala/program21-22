/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author agirrezabala.peru
 */
public class Enpresa implements Bezeroa {
   private int kodea;
   private String izenJuridikoa;
   private String izenKomertziala;
   private String helbidea;
   private String[] kontaktoenemailak;

    public int getKodea() {
        return kodea;
    }

    public String getHelbidea() {
        return helbidea;
    }
   
   public String getIzena(){
       return izenJuridikoa;
   }
   public String getEmaila(){
       
       return kontaktoenemailak[0];
   }
    
    
     
}
