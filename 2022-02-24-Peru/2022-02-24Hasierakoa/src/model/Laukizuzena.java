/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author agirrezabala.peru
 */
public abstract class Laukizuzena implements Marrazgarria {
    private Puntua erpinBat;
    private Puntua kontrakoErpina;

    public Laukizuzena(Puntua erpina, Puntua kontrakoErpina) {
        this.erpinBat = erpinBat;
        this.kontrakoErpina = kontrakoErpina;
    }
    
    public Laukizuzena(int x1, int y1, int x2, int y2){
        this.erpinBat=new Puntua(x1,y1);
        this.kontrakoErpina=new Puntua(x2,y2);
  
    }

    public Puntua getErpinBat() {
        return erpinBat;
    }

    public Puntua getKontrakoErpina() {
        return kontrakoErpina;
    }
    public Puntua[] getLauErpinenArraya(){
        Puntua[] lauErpinenArraya= new Puntua[4];
        lauErpinenArraya[0]=erpinBat;
        lauErpinenArraya[1]=new Puntua(erpinBat.getY(), kontrakoErpina.getX());
        lauErpinenArraya[2]=kontrakoErpina;
        lauErpinenArraya[3]=new Puntua(erpinBat.getX(), kontrakoErpina.getY());
        return lauErpinenArraya;
        
    }
    public ArrayList<Puntua> getLauerpinenArrayLista(){
        ArrayList<Puntua> lauerpinenArrayLista=new Puntua[4];
    }
    public String toString(){
        return"";
    }
    @Override
    public void marraztu() {
        
    }
    
}
