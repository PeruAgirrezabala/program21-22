/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

<<<<<<< HEAD
import java.time.LocalDate;
=======
>>>>>>> ad318edc19db29cf2450f8a35d69cdb170dd37b4
import java.util.ArrayList;

/**
 *
 * @author agirrezabala.peru
 */
public class EpekakoErosketa extends Erosketa {
    private int epeak=12;
    private boolean ordainketaBukatua=false;
    private double kuota;
    
<<<<<<< HEAD
    public EpekakoErosketa ( String kodea, LocalDate data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira, double kuota){
=======
    public EpekakoErosketa ( String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira, double kuota){
>>>>>>> ad318edc19db29cf2450f8a35d69cdb170dd37b4
        super(kodea,data,eroslea,produktuak,unitateak,guztira);
        this.kuota=kuota;
    }
    public double gainetikOrdainduBeharrekoa(){
<<<<<<< HEAD
       
        double diferentzia=0;
        diferentzia=(epeak*kuota)-guztira;
        return diferentzia;
=======
>>>>>>> ad318edc19db29cf2450f8a35d69cdb170dd37b4
        
    }
    
    
    
}
