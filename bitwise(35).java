/*The bitwise AND operator (&) compares each bit of the first operand to the corresponding bit of the second operand. If both bits are 1, the corresponding result bit is set to 1. Otherwise, the corresponding result bit is set to 0.
java */

public class Main {
    public static void main(String[] args) {
        int a = 60; // Binary:  0011 1100
        int b = 13; // Binary:  0000 1101
        int result = a & b; // Binary:  0000 1100 
        System.out.println("Result: " + result);
    }
}
/*The bitwise OR operator (|) compares each bit of the first operand to the corresponding bit of the second operand. If either bit is 1, the corresponding result bit is set to 1. Otherwise, the corresponding result bit is set to 0.
java */

public class Main {
    public static void main(String[] args) {
        int a = 60; // Binary:  0011 1100
        int b = 13; // Binary:  0000 1101
        int result = a | b; // Binary:  0011 1101
        System.out.println("Result: " + result);
    }
}

/* XOR operator (^) compares each bit of the first operand to the corresponding bit of the second operand. If the two bits are different, the corresponding result bit is set to 1. Otherwise, the corresponding result bit is set to 0.
java */

public class Main {
    public static void main(String[] args) {
        int a = 60; // Binary:  0011 1100
        int b = 13; // Binary:  0000 1101
        int result = a ^ b; // Binary:  0011 0001
        System.out.println("Result: " + result);
    }
}
