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
public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }   
    public double getAzalera(){
        double altuera,zabalera;
        if(topLeft.getY() > bottomRight.getY()){
            altuera=topLeft.getY()-bottomRight.getY(); 
        }else{
            altuera=bottomRight.getY()-topLeft.getY();
        }
        
        if(topLeft.getX()>bottomRight.getX()){
             zabalera=topLeft.getX()-bottomRight.getX();
        }else{
             zabalera=bottomRight.getX()-topLeft.getX();
        }
         return altuera*zabalera;
    }
    public double getPerimetroa(){
        double altuera,zabalera;
        if(topLeft.getY() > bottomRight.getY()){
            altuera=topLeft.getY()-bottomRight.getY(); 
        }else{
            altuera=bottomRight.getY()-topLeft.getY();
        }
        
        if(topLeft.getX()>bottomRight.getX()){
             zabalera=topLeft.getX()-bottomRight.getX();
        }else{
             zabalera=bottomRight.getX()-topLeft.getX();
        }
         return (altuera*2)+(zabalera*2); 
    }
    public String toString() {
      return ""+this.topLeft + this.bottomRight;
   }
   public boolean equal(MyRectangle another){
       if(bottomRight.equals(another.bottomRight) && topLeft.equals(another.topLeft)){
           return true;
       }else{
           return false;
       }
   }
    
    
}
