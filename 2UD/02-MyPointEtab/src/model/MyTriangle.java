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
public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "Triangle [v1=" + v1 + ",v2=" + v2 + ",v3=" + v3+"]";
    }

    public double getPerimeter() {
        double Perimeter;
        return Perimeter = v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        String tipo = "";
        if(v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)){
           tipo = "Equilateral";
        }
        else if(v1.distance(v2) == v3.distance(v1) && v1.distance(v2)!= v2.distance(v3) &&  v3.distance(v1) != v2.distance(v3)){
            tipo = "Isosceles";
        }
        else if(v1.distance(v2) != v2.distance(v3) && v1.distance(v2) != v3.distance(v1) && v2.distance(v3) != v3.distance(v1)){
            tipo = "Scalene";
        }
        return tipo;
    }  
    

    public MyPoint getv1() {
        return this.v1;
    }

    public void setv1(MyPoint v1) {
        this.v1 = v1;
    }

    public MyPoint getv2() {
        return this.v2;
    }

    public void setY(MyPoint v2) {
        this.v2 = v2;
    }

    public MyPoint getv3() {
        return this.v3;
    }

    public void setv3(MyPoint v3) {
        this.v3 = v3;
    }
}
