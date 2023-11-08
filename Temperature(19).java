import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9) / 5 + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        input.close();
    }
}

/* When you run this program, it will prompt you to enter the temperature in Celsius. Once you provide the Celsius temperature, the program will convert it to Fahrenheit and display the converted temperature.



*/
