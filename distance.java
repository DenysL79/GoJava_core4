package GoJava_Core4;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculation of the minimum distance " +
                "between points in the two-dimensional coordinate system ");

//first point coordinates

        System.out.println("First point coordinates. \nEnter coordinate x1: ");
        double x1 = scanner.nextInt();
        System.out.println("First point coordinates. \nEnter coordinate y1: ");
        double y1 = scanner.nextInt();
        System.out.println("You entered the following coordinates for te First point"
                + "\nx1: " + x1 + "\ny1: " + y1);

// second point coordinates

        System.out.println("Second point coordinates. \nEnter coordinate x2: ");
        double x2 = scanner.nextInt();
        System.out.println("First point coordinates. \nEnter coordinate y2: ");
        double y2 = scanner.nextInt();

        System.out.println("x1: " + x1 + "    y1: " + y1 + "\nx2: " + x2 + "    y2: " + y2);

        double d = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("The minim distance is:" + d);
    }
}
