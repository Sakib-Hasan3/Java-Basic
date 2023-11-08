/*Arithmetic operator in java


Addition(+): It is used to add two numbers. If the operands are numeric, it performs addition. If the operands are Strings, it performs concatenation.

Subtraction(-): It is used to subtract two numbers. If the first operand is greater than the second, it performs subtraction; otherwise, it results in an error.

Multiplication(*): It is used to multiply two numbers. If the operands are numeric, it performs multiplication.

Division(/): It is used to divide two numbers. If the second operand is 0, it results in an error (division by zero). If the operands are numeric, it performs division.

Modulus(%) It is used to calculate the remainder when the first operand is divided by the second.

Increment(++): It is used to increment the value of a variable by 1. The value of the variable after the operation will be its original value plus 1.

Decrement(--): It is used to decrement the value of a variable by 1. The value of the variable after the operation will be its original value minus 1.

Equality(==): It is used to compare two operands. If they are equal, it returns true; otherwise, it returns false.

Inequality(!=): It is used to compare two operands. If they are not equal, it returns true; otherwise, it returns false.

Less than(<): It is used to compare two operands. If the first operand is less than the second, it returns true; otherwise, it returns false.

Greater than(>): It is used to compare two operands. If the first operand is greater than the second, it returns true; otherwise, it returns false.

Less than or equal to(<=): It is used to compare two operands. If the first operand is less than or equal to the second, it returns true; otherwise, it returns false.

Greater than or equal to(>=): It is used to compare two operands. If the
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (double) num1 / num2);
        System.out.println("Modulus: " + (num1 % num2));
    }
}
