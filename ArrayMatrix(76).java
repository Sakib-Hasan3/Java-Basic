import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        int A[][] = new int[2][3];
        int B[][] = new int[2][3];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elements of matrix A = ");
        // input A matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" A[" + row + "][" + col + "] = ");
                A[row][col] = input.nextInt();
            }
        }

        // input B matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" B[" + row + "][" + col + "] = ");
                B[row][col] = input.nextInt();
            }
        }

        // print A matrix
        System.out.println("Matrix A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + A[row][col]);
            }
            System.out.println();
        }

        // print B matrix
        System.out.println("Matrix B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + B[row][col]);
            }
            System.out.println();
        }

         // Adding two matrix
         System.out.println("sum of two matrix = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " +A[row][col]+B[row][col]);
               
            }
    }
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
 B[0][0] = 7
 B[0][1] = 8
 B[0][2] = 9
 B[1][0] = 10
 B[1][1] = 11
 B[1][2] = 12
Matrix A = 
 1 2 3
 4 5 6
Matrix B =
 7 8 9
 10 11 12
sum of two matrix =
 17 28 39 410 511 612
