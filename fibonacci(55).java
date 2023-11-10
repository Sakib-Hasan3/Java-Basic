/*Enter How many NUmber 
6
0 1
 1
 2
 3
 5
 video 55 */

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;
        System.out.println("Enter How many NUmber ");
        n=input.nextInt();

        int first=0;
        int second=1;
        int fibo=0;

        System.out.println(first +" "+second );

        for(int i=3;i<=n;i++)
        {
            fibo=first+second;
            System.out.println( " "+fibo);

          first=second;
          second=fibo;
        }
    }
    
}
