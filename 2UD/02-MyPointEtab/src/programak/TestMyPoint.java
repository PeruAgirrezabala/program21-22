/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programak;

import java.util.ArrayList;
import java.util.Scanner;
import model.MyPoint;

/**
 *
 * @author agirrezabala.peru
 */
public class TestMyPoint {

    public static void main(String[] args) {

        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
            System.out.println(points[i]);
        }
        MyPoint p0 = new MyPoint(1, 1);
        MyPoint p1 = new MyPoint(6, 4);
        MyPoint p2 = new MyPoint(4, 2);

        System.out.println("Kordenatu-jatorrira dagoen distantzia-> " + p0.distance());
        System.out.println("Kordenatu-jatorrira dagoen distantzia-> " + p1.distance());
        System.out.println("Kordenatu-jatorrira dagoen distantzia-> " + p2.distance());
        Scanner sc = new Scanner(System.in);
        ArrayList<MyPoint> puntu = new ArrayList<MyPoint>();
        for (int i=0;i<3;i++){
        System.out.println("Sartu Puntu Bat con espacio: ");
        MyPoint p=new MyPoint(sc.nextInt(),sc.nextInt());
        puntu.add(p);
        System.out.println(puntu);
    }
        ArrayList<MyPoint> puntuAleatorio = new ArrayList<MyPoint>();
        for (int i = 0; i < 3; i++) {
            int numero1 = (int) (Math.random() * 10) + 1;
            int numero2 = (int) (Math.random() * 10) + 1;
            MyPoint pa = new MyPoint(numero1, numero2);
            puntuAleatorio.add(pa);
            System.out.println(puntuAleatorio);
        }

        System.out.println("Koordenatu Kartesiarra: ");
        MyPoint[] hirupuntu = {p0, p1, p2};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                if (j == 0) {
                    System.out.print("|");
                }
                else if (i == 9) {
                    System.out.print("=");
                }
                else if (i ==9-hirupuntu[0].getX() - 1 && j == hirupuntu[0].getY() + 1 || i ==9-hirupuntu[1].getX() - 1 && j == hirupuntu[1].getY() + 1  || i ==9-hirupuntu[2].getX() - 1 && j == hirupuntu[2].getY() + 1 ) {
                        System.out.print("*");
                    }
                else{System.out.print(" ");}
            }
            System.out.println("");

        }

    }
}
