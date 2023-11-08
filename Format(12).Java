/* a format specifier is a set of characters that follow the escape character % (percent). These characters specify the format of the argument to be formatted.*/

code :

public class Main {
    public static void main(String[] args) {
        int i = 123;
        float f = 123.456F;
        String s = "Hello, World!";

        System.out.printf("Decimal: %d, Hexadecimal: %x, Octal: %o, Unsigned: %u%n", i, i, i, i);
        System.out.printf("Float: %f, Scientific Notation: %e, Default Precision: %g%n", f, f, f);
        System.out.printf("String: %s, Character: %c%n", s, s.charAt(0));
    }
}

output : 
Decimal: 123, Hexadecimal: 7b, Octal: 173, Unsigned: 123
Float: 123.456001, Scientific Notation: 1.234560e+02, Default Precision: 1.23456e+02
String: Hello, World!, Character: H
