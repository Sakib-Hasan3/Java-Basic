import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {

           Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter any Number= ");
        n = input.nextInt();

        int sum = 0, temp = 0, r;
        temp = n;
        while (temp != 0) {
            r = temp % 10;
            sum = sum*10 + r;
            temp = temp / 10;
        }

        if (n == sum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

    }
}
/* output 
  Enter any Number= 
5
Palindrome number
  */
  
