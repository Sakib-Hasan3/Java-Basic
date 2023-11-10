//video 54

import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m;
        System.out.println("Enter initial Number = ");
        m = input.nextInt();

        int n;
        System.out.println("Enter final Number = ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            int count = 0;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
/* 
output 
  Enter initial Number = 
10
Enter final Number = 
20
11
13
17
19
  */
