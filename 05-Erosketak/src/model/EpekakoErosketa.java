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
public class EpekakoErosketa extends Erosketa {
    private int epeak=12;
    private boolean ordainketaBukatua=false;
    private double kuota;
    
    public EpekakoErosketa ( String kodea, LocalDate data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira, double kuota){
        super(kodea,data,eroslea,produktuak,unitateak,guztira);
        this.kuota=kuota;
    }
    public double gainetikOrdainduBeharrekoa(){
       
        double diferentzia=0;
        diferentzia=(epeak*kuota)-guztira;
        return diferentzia;
        
    }
    
    
    
}
