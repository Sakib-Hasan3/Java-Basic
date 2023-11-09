public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Ternary operator
        int max = (x > y) ? x : y;

        // if-else statement
        if (x > y) {
            max = x;
        } else {
            max = y;
        }

        System.out.println("Max value is: " + max);
    }
}
