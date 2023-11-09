/* Conditional statement (if, if-else, if-else if-else)
Conditional statements are used to control the flow of a program based on specific conditions. They can be used to test a single condition or a set of conditions.*/

// if statement example
int number = 5;
if (number % 2 == 0) {
    System.out.println("Number is even");
}

// if-else statement example
int number = 6;
if (number % 2 == 0) {
    System.out.println("Number is even");
} else {
    System.out.println("Number is odd");
}

// if-else if-else statement example
int number = 7;
if (number % 2 == 0) {
    System.out.println("Number is even");
} else if (number % 3 == 0) {
    System.out.println("Number is divisible by 3");
} else {
    System.out.println("Number is odd");
}
