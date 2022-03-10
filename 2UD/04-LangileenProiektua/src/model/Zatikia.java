package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agirrezabala.peru
 */
public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;
    
    
    public Zatikia(int zenba, int izenda){
        this.zenbakitzailea=zenba;
        this.izendatzailea=izenda;    
    }
    public int getZenbakitzailea(int zenba){
        return zenba;
        
    }
    public int getIzendatzailea(int izenda){
        return izenda;
    }
    
   
    public void setZenbakitzailea(int zenba){
        zenbakitzailea=zenba;
        
    }
    public void setIzendatzailea(int izenda){
        izendatzailea=izenda;
    }
    public String toString(){
        return "zat=[" +"zenbakitzailea="+ zenbakitzailea + ",izendatzailea=" + izendatzailea + "]";
    }
    public static Zatikia biderkatu( Zatikia zat1, Zatikia zat2){
        Zatikia zat3= new Zatikia(0,0);
        zat3.zenbakitzailea=zat1.zenbakitzailea*zat2.zenbakitzailea;
        zat3.izendatzailea=zat2.izendatzailea*zat2.izendatzailea;
        return zat3;
        
    }


    
        public static Zatikia batu( Zatikia zat1, Zatikia zat2){
        Zatikia zat3= new Zatikia(0,0);
        zat3.zenbakitzailea=(zat1.zenbakitzailea+zat2.izendatzailea)+(zat2.zenbakitzailea+zat1.izendatzailea);
        zat3.izendatzailea=zat2.izendatzailea*zat2.izendatzailea;
        return zat3;
        }
        public void batu(Zatikia besteZatBat){
        
        this.zenbakitzailea=(this.zenbakitzailea+besteZatBat.izendatzailea)+(besteZatBat.zenbakitzailea+this.izendatzailea);
        this.izendatzailea=this.izendatzailea*besteZatBat.izendatzailea;
        
    }
        public boolean isBaliokidea(Zatikia z){
            boolean emaitza=false;
            if(this.hamartarBaliokidea()==z.hamartarBaliokidea()){
                emaitza= true;
                
            }
            return emaitza;
        } 
        public double hamartarBaliokidea(){
            return(double) this.izendatzailea/this.zenbakitzailea;
        }
        public boolean isBiggerThan(Zatikia besteZatikiBat){
            if((this.zenbakitzailea/this.izendatzailea)>(besteZatikiBat.zenbakitzailea/besteZatikiBat.izendatzailea)){
                return true;
            }else{
                return false;
            }
        }
        private int mcd(){
                    int u = Math.abs(this.zenbakitzailea); //valor absoluto del numerador
        int v = Math.abs(this.izendatzailea); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }
        public void sinplifikatu(){
        int n = mcd(); //se calcula el mcd de la fracción
        this.zenbakitzailea = this.zenbakitzailea / n;
        this.izendatzailea = this.izendatzailea/ n;
        }
        
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.zenbakitzailea;
        hash = 47 * hash + this.izendatzailea;
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
        final Zatikia other = (Zatikia) obj;
        if (this.zenbakitzailea != other.zenbakitzailea) {
            return false;
        }
        if (this.izendatzailea != other.izendatzailea) {
            return false;
        }
        return true;
    }
    public Zatikia(String zatIdatzia){
        int posBarra= zatIdatzia.indexOf("/");
        String strGoikoa= zatIdatzia.substring(0, posBarra);
        
        ////KONBERTSIOAK:   
        //String=> Interger edo int
        Integer zenbakitzailea= Integer.parseInt(strGoikoa);
        //edo
        zenbakitzailea = Integer.valueOf(strGoikoa);
        //Integer=> String
        strGoikoa= zenbakitzailea.toString();
        int intGoikoa = zenbakitzailea;
        //int=>String
        strGoikoa=""+ intGoikoa;
        //edo
        Integer.toString(intGoikoa);
        
        
    }
    public static void zatikiakOrdenatu( Zatikia zatikiak[]){
        Zatikia aux= new Zatikia(0,0);
        boolean berriroEgin=true;
        while(berriroEgin){
            berriroEgin=false;
           for(int i=0; i<zatikiak.length;i++){
               if(zatikiak[i].isBiggerThan(zatikiak[i+1])){
                   aux= zatikiak[i];
                   zatikiak[i]=zatikiak[i+1];
                   zatikiak[i+1]=aux;
                   berriroEgin=true;
                   
               }
                   
           }
        
    }
    }
}
