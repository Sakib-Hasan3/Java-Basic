
import java.util.Scanner;

public class diagonal {
      public static void main(String[] args) {
        int A[][] = new int[3][3];
        int sumofdiagonal=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elements of matrix A = ");
        // input A matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" A[" + row + "][" + col + "] = ");
                A[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                if (row==col)
                {
                    sumofdiagonal+=A[row][col];
                    
                }
            }
        }
        System.out.println("Sum of diagonal= " +sumofdiagonal);
                    
    }
}

//output
Enter elements of matrix A = 
 A[0][0] = 1
 A[0][1] = 2
 A[0][2] = 3
 A[1][0] = 4
 A[1][1] = 5
 A[1][2] = 6
 A[2][0] = 7
 A[2][1] = 8
 A[2][2] = 9
Sum of diagonal= 15
