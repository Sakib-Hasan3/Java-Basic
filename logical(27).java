/*
In Java, logical operators are used to compare the values of two expressions or variables. These operators can only be used with boolean data types. The three logical operators in Java are AND (&&), OR (||), and NOT (!).

Understand the difference between AND (&&), OR (||), and NOT (!) operators
AND (&&): This operator returns true if both the expressions are true. Otherwise, it returns false.

OR (||): This operator returns true if at least one of the expressions is true. Otherwise, it returns false.

NOT (!): This operator returns true if the expression is false. Otherwise, it returns false.
*/

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b)); // AND operator
        System.out.println("a || b = " + (a || b)); // OR operator
        System.out.println("!a = " + !a); // NOT operator
    }
}

/*
The output of the code will be:
Download
Copy code
a && b = false
a || b = true
!a = false
*/
  /* Analyze the output
In the AND operation, since 'a' is true and 'b' is false, the expression 'a && b' returns false.

In the OR operation, since 'a' is true and 'b' is false, the expression 'a || b' returns true.

In the NOT operation, since 'a' is true, the expression '!a' returns false.*/



