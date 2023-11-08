/* Area of Triangle */

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the length of the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}

/* Area of circle */

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = calculateArea(radius);

        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }

    
}
