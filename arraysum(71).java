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

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }

        double average = (double) sum / length;

        System.out.println("The array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nThe sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
    }
}
