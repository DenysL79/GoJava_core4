package GoJava_Core4;

import java.util.Scanner;
import java.lang.Math;

public class area_calc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle - 1\n" + "Rectangle - 2\n" + "Triangle - 3\n" +
                "Select type of figure to calculate area:");
        int figureType = scanner.nextInt();
// Calculate Area of Circle.
        if (figureType == 1) {
            System.out.println("Calculate Circle Area:\n" + "Enter Circle radius in cm:");
            double r = scanner.nextDouble();
            System.out.println("You entered radius R = " + r + " cm.");
            double circleArea;
            circleArea = 3.14 * r * r;
            System.out.println("The Circle area is: " + circleArea + " sq. cm.");
        }
// Calculate Area of Rectangle.
        if (figureType == 2){
            System.out.println("Calculate Rectangle Area:\n" + "Enter rectangle width in cm.:");
            double width = scanner.nextDouble();
            System.out.println("Enter rectangle height: ");
            double height = scanner.nextDouble();
            System.out.println("You entered the following rectangle parameters: " + "W = "
                    + width + "H = " + height + " cm.");
            double rectangleArea;
            rectangleArea = width * height;
            System.out.println("The rectangle area is: " + rectangleArea + " sq. cm.");
        }
 // Calculate Area of Triangle.
        if (figureType == 3){
            System.out.println("Calculate Triangle Area:\n" + "Enter triangle sides in cm.\n"
                    + "Side a: ");
            double a = scanner.nextDouble();
            System.out.println("Side b: ");
            double b = scanner.nextDouble();
            System.out.println("Side c: ");
            double c = scanner.nextDouble();
            System.out.println("You entered te following parameters for the triangle\n" +
                    "Side a = " + a + "\nSide b = " + b + "\nSide c = " + c);
            double triangleArea;
            double s;
            s = (a + b + c)/2;
            triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of triangle is: " + triangleArea + " sq.cm.");

        }
    }
}
