package GoJava_Core4;

import java.util.Scanner;

public class temperature_conv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// read user input
        System.out.println("Enter 1. Fahrenheit to Celsius:");
        System.out.println("Enter 2. Celsius To Fahrenheit:");
        int input = scanner.nextInt();


        if (input == 1){
            System.out.println("Please enter temperature in Farenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (5.0/9.0) * (fahrenheit - 32);
            System.out.println("Temperature in Celsius is : " + celsius);
        }

        if (input == 2){
            System.out.print("Please enter temperature in Celsius : ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (9.0/5.0)*celsius + 32;
            System.out.println("Temperature in Fahrenheit is : " + fahrenheit);

        }

    }
}
