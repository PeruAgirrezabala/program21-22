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
<<<<<<< HEAD
        public Erosketa(String kodea, Bezeroa bezeroa, double guztira){
            this.kodea=kodea.toCharArray();
            this.bezeroa=bezeroa;
            this.guztira=guztira;
        }
        public Erosketa(String kodea,LocalDate data,Bezeroa bezeroa, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira){
            this.kodea=kodea.toCharArray();
=======
        public Erosketa(char[] kodea, Bezeroa bezeroa, double guztira){
            this.kodea=kodea;
            this.bezeroa=bezeroa;
            this.guztira=guztira;
        }
        public Erosketa(char[] kodea,Bezeroa bezeroa, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira){
            this.kodea=kodea;
>>>>>>> ad318edc19db29cf2450f8a35d69cdb170dd37b4
            this.bezeroa=bezeroa;
            this.produktuak=produktuak;
            this.unitateak=unitateak;
            this.guztira=guztira;
<<<<<<< HEAD
            this.data=data;
=======
            
>>>>>>> ad318edc19db29cf2450f8a35d69cdb170dd37b4
        }
    @Override
        public String toString(){
            return "Erosketa{" + "kodea=" + String.valueOf(kodea) + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
        }
        public String toStringLuzea(){
            return "Erosketa" + "Kodea=" + String.valueOf(kodea) + "\nData=" + data + "\n Bezeroa=" + bezeroa + "\n Produktuak=" + produktuak + "\n Unitateak=" + unitateak + "\n Guztira=" + guztira ;
        }
<<<<<<< HEAD
        public boolean guztiraEgiaztatu(){
            int kalkuluaGuztira=0;
            
            
        }
=======
>>>>>>> ad318edc19db29cf2450f8a35d69cdb170dd37b4
        
}
