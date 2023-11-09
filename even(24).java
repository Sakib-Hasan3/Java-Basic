import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare an integer variable to hold the user input
        int number;

        // Create a Scanner object to read the input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the integer input from the user and store it in the declared variable
        System.out.println("Enter an integer number: ");
        number = scanner.nextInt();

        // Check if the input is an even number by using the modulus operator
        if (number % 2 == 0) {
            // If the number is even, print a message indicating this
            System.out.println("The number " + number + " is even.");
        } else {
            // If the number is odd, print a message indicating this
            System.out.println("The number " + number + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}
