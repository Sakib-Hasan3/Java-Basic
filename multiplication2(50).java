/*Enter initial Number = 
5
Enter final Number = 
10
5X0=0 
5X1=5 
5X2=10
5X3=15
5X4=20
5X5=25
5X6=30
5X7=35
5X8=40
5X9=45
5X10=50
6X0=0
6X1=6
6X2=12
6X3=18
6X4=24
6X5=30
6X6=36
6X7=42
6X8=48
6X9=54
6X10=60
7X0=0
7X1=7
7X2=14
7X3=21
7X4=28
7X5=35
7X6=42
7X7=49
7X8=56
7X9=63
7X10=70
8X0=0
8X1=8
8X2=16
8X3=24
8X4=32
8X5=40
8X6=48
8X7=56
8X8=64
8X9=72
8X10=80
9X0=0
9X1=9
9X2=18
9X3=27
9X4=36
9X5=45
9X6=54
9X7=63
9X8=72
9X9=81
9X10=90
10X0=0
10X1=10
10X2=20
10X3=30
10X4=40
10X5=50
10X6=60
10X7=70
10X8=80
10X9=90
10X10=100
video 51 */

import java.util.Scanner;

public class multiplication2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m;
        System.out.println("Enter initial Number = ");
        m=input.nextInt();

         int n;
        System.out.println("Enter final Number = ");
        n=input.nextInt();

        for(int i=m ; i<=n;i++)
        {
            for(int j=0;j<=10;j++)
            {
                System.out.println(i + "X" +j + "=" +(i*j));
            }
        }
    }
    
}
