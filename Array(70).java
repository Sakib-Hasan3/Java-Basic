//Array declare

int[] array = new int[5]; // an array of integers with a size of 5

//array input from user 
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
*/

public class Array1 {
    public static void main(String[] args) {
        int number[]=new int[5];
        number[0]=1;
          number[1]=2;
            number[2]=3;
              number[3]=4;
                number[4]=5;

                int len=number.length;
                System.out.println("Length of array is "+len);

                int sum=  number[0]+  number[1]+  number[2]+  number[3]+  number[4];
                System.out.println("Sum = "+sum);
    }
    
}

output
  Length of array is 5
Sum = 15
  
