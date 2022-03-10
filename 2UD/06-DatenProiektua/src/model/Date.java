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
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        System.out.printf("%4d/%02d/%02d", year, month, day);
        return "";
    }

    public String getHilabeteaLetretan() {
        String[] hilabeteak= {"Urtarrila","Otsaila","Martxoa","Apirila","Maiatza","Ekaina","Uztaila","Abuztua","Iraila","Urria","Azaroa","Abendua"};
        int index;
        index=month-1;
        System.out.println(hilabeteak[index]);
        return "";
        
                
    }
    public String getHilabeteaLetretan(String hizkuntza){
        String[] hilabeteak= {"Urtarrila","Otsaila","Martxoa","Apirila","Maiatza","Ekaina","Uztaila","Abuztua","Iraila","Urria","Azaroa","Abendua"};
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int index=month-1;
        switch(hizkuntza){
            case"EU":
                System.out.println(hilabeteak[index]);
                break;
            case"EN":
                System.out.println(months[index]);
                break;
            case"ES":
                System.out.println(meses[index]);
                break;
        }
        return "";
    }
        
    
}
