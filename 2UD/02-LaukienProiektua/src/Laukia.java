
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
public class Laukia {

     private int zabalera;
    private int altuera;

    public Laukia() {
        zabalera = 5;
        altuera = 5;

    }

    public Laukia(int zab, int alt) {
        zabalera=zab;
        altuera=alt;
    }

    public int getZabalera() {
        return zabalera;
    }

    public int getAltuera() {
        return altuera;
    }

    public int getAzalera() {
        return zabalera * altuera;
    }

    public int getPerimetroa() {
        return (zabalera * 2) + (altuera * 2);
    }

    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;
    }

    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;
    }

    public String toString() {
        return "laukia=[" + altuera + "x" + zabalera + "]";
    }
    public String getMota(){
        if(zabalera<altuera){
            return "bertikala";
        }else if(zabalera>altuera){
            return "horizontala";
        }else{
            return "karratua";
        }
    }
    public void marraztuBeteta(int alt, int zab){

        for(int i=0; i<alt;i++){
            for(int a=0;a<zab;a++){
                System.out.print("* ");
            }
                System.out.println();
             
        }
        
    }
        public void marraztuHutsik(int alt, int zab){
        for(int lerro=0; lerro<alt;lerro++){
            for(int zutabe=0;zutabe<zab;zutabe++){
                if(zutabe==0||lerro==0||zutabe==zab-1||lerro==alt-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
            }
             
        }
        System.out.println();
    }

}
        public boolean isBiggerThan(Laukia l){
            if (this.getAzalera() > l.getAzalera()){
                return true;
            }else{
                return false;
                
            }
        }
}
