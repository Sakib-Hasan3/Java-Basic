/* The unary operator in Java is a type of operator that requires only one operand. These operators can be divided into three categories: increment/decrement operators, arithmetic negation operators, and logical negation operators.*/

public class Main {

    public static void main(String[] args) {
        int num = 10;
        int num1 = 5;
        int num2 = 3;

        // increment/decrement operators
        System.out.println("Before increment: " + num);
        System.out.println("After increment: " + ++num); // Prefix increment

        System.out.println("Before decrement: " + num1);
        System.out.println("After decrement: " + --num1); // Prefix decrement

        // arithmetic negation operators
        System.out.println("Arithmetic negation of: " + num2);
        System.out.println("Is: " + -num2);

        // logical negation operators
        boolean flag = true;
        System.out.println("Before logical negation: " + flag);
        System.out.println("After logical negation: " + !flag);
    }
}

output : 

Before increment: 10
After increment: 11
Before decrement: 5
After decrement: 4
Arithmetic negation of: 3
Is: -3
Before logical negation: true
After logical negation: false
