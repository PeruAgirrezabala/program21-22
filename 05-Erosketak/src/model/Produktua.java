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
public class Produktua {
    private char[] kodea;
    private String izena;
    private double prezioa;
    
    public Produktua(String kodea, String izena, double prezioa){
        this.kodea=kodea.toCharArray();
        this.izena=izena;
        this.prezioa=prezioa;
        
        
    }
    
    public char[] getKodea(){
        return kodea;
    }
        
        public String getStrKodea(){
            return new String(kodea);
        }
    
    
}
