/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author agirrezabala.peru
 */
public class Erosketa {
    
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak= new ArrayList();
    protected ArrayList<Integer> unitateak= new ArrayList();
    protected Double guztira;
        public Erosketa(String kodea, Bezeroa bezeroa, double guztira){
            this.kodea=kodea.toCharArray();
            this.bezeroa=bezeroa;
            this.guztira=guztira;
        }
        public Erosketa(String kodea,LocalDate data,Bezeroa bezeroa, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira){
            this.kodea=kodea.toCharArray();
            this.bezeroa=bezeroa;
            this.produktuak=produktuak;
            this.unitateak=unitateak;
            this.guztira=guztira;
            this.data=data;
        }
    @Override
        public String toString(){
            return "Erosketa{" + "kodea=" + String.valueOf(kodea) + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
        }
        public String toStringLuzea(){
            return "Erosketa" + "Kodea=" + String.valueOf(kodea) + "\nData=" + data + "\n Bezeroa=" + bezeroa + "\n Produktuak=" + produktuak + "\n Unitateak=" + unitateak + "\n Guztira=" + guztira ;
        }
        
}
