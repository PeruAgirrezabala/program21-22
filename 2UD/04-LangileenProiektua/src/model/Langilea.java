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
public class Langilea {
    int id;
    String izena, abizena;
    double soldata;
    private Zatikia lanaldia = new Zatikia ("1/1");


    
    public Langilea(int id, String izena,String abizena, double soldata){
        this.id=id;
        this.izena=izena;
        this.abizena=abizena;
        this.soldata=soldata;               
    } 
    public int getId(){
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public double getSoldata() {
        return soldata;
    }
    public Zatikia getLanaldia() {
        return lanaldia;
    }

    public String getIzenOsoa(){
        String izenOsoa;
       izenOsoa=izena+" "+abizena;
       return izenOsoa;
    }
    public double getUrtekoSoldata(){
        return soldata*12;
    }
    public void setSoldata(double soldata){
        this.soldata=soldata;
    }

    public void setLanaldia(Zatikia lanaldia) {
        if(lanaldia.hamartarBaliokidea()>0){
          this.lanaldia = lanaldia;  
        }
 
    }
    
    public double soldataIgo(int portzentaia){
        double b = Double.valueOf(portzentaia);
        this.soldata=soldata*(1+b/100);
        return soldata;
    }
    public String toString(){
        return "[id="+id+" ,Izena="+izena +" "+ abizena+",Soldata="+soldata;
    }
    public static Langilea[] nireHamarLagunLangile(){
        Langilea[] langileak= {
            new Langilea(1,"Pedro","Gimenez",500),
            new Langilea(2,"Andrea","Perez",700),
            new Langilea(3,"Aron","Agirrezabala",500),
            new Langilea(4,"Juan","Gomez",600),
            new Langilea(5,"Aitor","Duo",450),
            new Langilea(6,"Oroitz","Zulaica",900),
            new Langilea(7,"Iñigo","Goikoetxea",200),
            new Langilea(8,"Lukas","Zendoia",50),
            new Langilea(9,"Irene","Arregi",1000),
            new Langilea(10,"Pablo","Irulegi",900)};
        
        return langileak;
        
    }
    public static Langilea bilatu(Langilea[] lk, String izena){
        String a;
        for(int i=0; i<lk.length; i++){
            a=lk[i].getIzena();
            if(a.equals(izena)){
                return lk[i];
            }
            
           
    }
         return null;
}
}