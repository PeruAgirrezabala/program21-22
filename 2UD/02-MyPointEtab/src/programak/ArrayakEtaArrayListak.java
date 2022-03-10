/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programak;

import java.util.ArrayList;
import model.MyPoint;
import model.MyRectangle;
import model.MyTriangle;

/**
 *
 * @author agirrezabala.peru
 */
public class ArrayakEtaArrayListak {

    public static void main(String[] args) {
        MyTriangle tri1 = new MyTriangle(new MyPoint(0, 1), new MyPoint(4, 1), new MyPoint(0, 4));
        MyTriangle tri2 = new MyTriangle(new MyPoint(3, 6), new MyPoint(5, 2), new MyPoint(2, 4));
        MyTriangle tri3 = new MyTriangle(new MyPoint(0, 3), new MyPoint(7, 3), new MyPoint(1, 6));

        MyRectangle rec1 = new MyRectangle(new MyPoint(1, 5), new MyPoint(7, 3));
        MyRectangle rec2 = new MyRectangle(new MyPoint(1, 5), new MyPoint(7, 3));
        MyRectangle rec3 = new MyRectangle(new MyPoint(5, 10), new MyPoint(4, 3));
        System.out.println("Triangeluak-->");
        MyTriangle[] array1 = {tri1, tri2, tri3};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("LaukizuzenaK-->");
        ArrayList<MyRectangle> rec = new ArrayList<MyRectangle>();
        rec.add(rec1);
        rec.add(rec2);
        rec.add(rec3);
        System.out.println(rec);
        System.out.println(rec1.equal(rec2));
    }

}
