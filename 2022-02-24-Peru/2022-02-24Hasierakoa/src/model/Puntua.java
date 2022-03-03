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
public class Puntua implements Marrazgarria {


    private int x;
    private int y;
    private static  int  sortutakoPuntuak=0;

    public Puntua() {
        sortutakoPuntuak++;
    }

    public Puntua(int x, int y) {
        this.x = x;
        this.y = y;
        sortutakoPuntuak++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSortutakoPuntuak() {
        return sortutakoPuntuak;
        
    }

    public boolean isEzkerreragoThan(Puntua bestePuntubat){
        return this.x< bestePuntubat.getX();
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puntua other = (Puntua) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    
    
    public String toString(){
        return "("+x+", "+y+")";
    }
    
    @Override
    public void marraztu(){
        System.out.println(this.toString()+" puntua GUI batean marraztua izan da");
        
    }
    
    
}
