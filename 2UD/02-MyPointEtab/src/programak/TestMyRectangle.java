/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programak;

import model.MyPoint;
import model.MyRectangle;

/**
 *
 * @author agirrezabala.peru
 */
public class TestMyRectangle {

    public static void main(String[] args) {
        MyRectangle rec1 = new MyRectangle(new MyPoint(1,5), new MyPoint(7,3));
        System.out.println(rec1);
        System.out.println("  Perimetroa: " + rec1.getPerimetroa());
        System.out.println("  Azalera: " + rec1.getAzalera());
        System.out.println("");

    }
}
