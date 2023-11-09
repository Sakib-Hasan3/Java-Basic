/* break statement:
The break statement is used to exit a loop before all the iterations have been executed.
*/

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Number: " + i);
        }
    }
}
output = 
  1
  2
  3
  4
  
/* In this code, the loop will break and stop executing when the variable i is equal to 5.
*/
/* continue statement:
The continue statement is used to skip the remaining part of the current iteration and proceed to the next iteration of the loop.

*/
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd Number: " + i);
        }
    }
}
output=
  2
  4
  6
  8
  10
/* In this code, the loop will skip the odd numbers (when i is divisible by 2) and only print the odd numbers.*/

