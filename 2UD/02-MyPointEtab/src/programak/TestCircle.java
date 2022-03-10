/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programak;

import model.MyCircle;
import model.MyPoint;
import model.MyRectangle;

/**
 *
 * @author agirrezabala.peru
 */
public class TestCircle {
   public static void main(String[] args) {
      // Test Constructors and toString()
      MyCircle c1 = new MyCircle();
      System.out.println(c1);  // Circle's toString()
      MyCircle c2 = new MyCircle(1, 2, 55);
      System.out.println(c2);  // Circle's toString()
      MyCircle c3 = new MyCircle(new MyPoint(4, 5), 6.6);   // an anonymous Point instance
      System.out.println(c3);  // Circle's toString()
      MyPoint c4= new MyPoint(2,4);
      MyPoint c5=new MyPoint(6,2);
      c1.setCenter(new MyPoint(11, 12));
      c1.setRadius(13.3);
      System.out.println(c1);  // Circle's toString()
      System.out.println("center is: " + c1.getCenter());  // Point's toString()
      System.out.println("radius is: " + c1.getRadius());

      c1.setCenterX(21);
      c1.setCenterY(22);
      System.out.println(c1);  // Circle's toString()
      System.out.println("center's x is: " + c1.getCenterX());
      System.out.println("center's y is: " + c1.getCenterY());
      c1.setCenterXY(31, 32);
      System.out.println(c1);  // Circle's toString()
      System.out.println("center's x is: " + c1.getCenterXY()[0]);
      System.out.println("center's y is: " + c1.getCenterXY()[1]);

      // Test getArea() and getCircumference()
      System.out.printf("area is: %.2f%n", c1.getArea());
      System.out.printf("circumference is: %.2f%n", c1.getCircumference());

      // Test distance()
      System.out.printf("distance is: %.2f%n", c1.distance(c2));
      System.out.printf("distance is: %.2f%n", c2.distance(c1));
      System.out.println("");
      System.out.println(c2.isInside(c4));
      MyRectangle r1=new MyRectangle(c4,c5);
       System.out.println(r1.getAzalera());
       System.out.println(r1.getPerimetroa());
       System.out.println(r1.toString());
   }
}

