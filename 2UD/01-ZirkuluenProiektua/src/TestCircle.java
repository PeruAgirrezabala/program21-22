
/**
 * A Test Driver for the "Circle" class
 */
public class TestCircle {    // Save as "TestCircle.java"

    public static void main(String[] args) {   // Program entry point
        System.out.println("Zirkulua    Erradioa    Kolorea    Azalera");
        System.out.println("============================================");

        // Declare and Construct an instance of the Circle class called c1
        Circle c1 = new Circle(2.0, "blue");  // Use 3rd constructor
        System.out.printf("   C1   ");
        System.out.printf("      " + c1.getRadius());  // use dot operator to invoke member methods
        //The radius is: 2.0
        System.out.printf("        " + c1.getColor());
        //The color is: blue
        System.out.printf("      %.2f%n", c1.getArea());
        System.out.println();
        //The area is: 12.57

        // Declare and Construct another instance of the Circle class called c2
        Circle c2 = new Circle(2.0);  // Use 2nd constructor
        System.out.printf("   C2   ");
        System.out.printf("      " + c2.getRadius());
        //The radius is: 2.0
        System.out.printf("        " + c2.getColor());
        //The color is: red
        System.out.printf("      %.2f%n", c2.getArea());
        System.out.println();
        //The area is: 12.57

        // Declare and Construct yet another instance of the Circle class called c3
        Circle c3 = new Circle();  // Use 1st constructor
        System.out.printf("   C3   ");
        System.out.printf("      " + c3.getRadius());
        //The radius is: 1.0
        System.out.printf("        " + c3.getColor());
        //The color is: red
        System.out.printf("      %.2f%n", c3.getArea());
        System.out.println();
        //The area is: 3.14

        // Declare and Construct yet another instance of the Circle class called c3
        Circle c4 = new Circle(5.00, "blue");  // Use 1st constructor
        System.out.printf("   C4   ");
        System.out.printf("      " + c4.getRadius());
        //The radius is: 1.0
        System.out.printf("        " + c4.getColor());
        //The color is: red
        System.out.printf("      %.2f%n", c4.getArea());
        System.out.println();
        //The area is: 3.14
        System.out.println("ToString erabiliaz");
        System.out.printf("c1" + c1.toString());
        System.out.println();
        System.out.printf("c2" + c2.toString());
        System.out.println();
        System.out.printf("c3" + c3.toString());
        System.out.println();
        System.out.printf("c4" + c4.toString());
        //10 aldiz c1 handitu=>inprimatu. Seigarrenean kolorea aldatu.
        for (int i = 10; i >0; i--) {
            
            System.out.println(c1);
            c1.setRadius(c1.getRadius() + 1);
            if(i==6){
            c1.setColor("magenta");
        }

        }

    }
}
