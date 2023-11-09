import java.util.Scanner;
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
System.out.println("Enter a letter: ");
char letter = scanner.next().charAt(0);
  letter = Character.toLowerCase(letter);
switch (letter) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        System.out.println("The letter '" + letter + "' is a vowel.");
        break;
    default:
        System.out.println("The letter '" + letter + "' is not a vowel.");
}
