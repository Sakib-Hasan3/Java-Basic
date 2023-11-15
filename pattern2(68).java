
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enter a number = ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }
}



output :

Enter a number = 
5
 1        
 1 2      
 1 2 3    
 1 2 3 4  
 1 2 3 4 5
