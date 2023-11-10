/*1+2+3......+n

import java.util.Scanner;

public class seies2 
{

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int sum=0;
    int n;
    System.out.println("Enter initial number = ");
    n=input.nextInt();

    for(int i=1;i<=n;i++)
    {
        System.out.println(" "+i);
        sum=sum+i;
    }

System.out.println(sum);
}
    
}
*/

/*1+3+5......+n

import java.util.Scanner;

public class seies2 
{

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int sum=0;
    int n;
    System.out.println("Enter initial number = ");
    n=input.nextInt();

    for(int i=1;i<=n;i=i+2)
    {
        System.out.println(" "+i);
        sum=sum+i;
    }

System.out.println(sum);
}
    
}
*/




/*import java.util.Scanner;

public class seies2 
{

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int sum=0;
    int n;
    System.out.println("Enter initial number = ");
    n=input.nextInt();

    for(int i=2;i<=n;i=i+2)
    {
        System.out.println(" "+i);
        sum=sum+i;
    }

System.out.println(sum);
}
    
}
*/

//1.5+2.5+3.5......+n

import java.util.Scanner;

public class seies2 
{

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double sum=0;
    double n;
    System.out.println("Enter initial number = ");
    n=input.nextDouble();

    for(double i=1.5;i<=n;i=i+1)
    {
        System.out.println(" "+i);
        sum=sum+i;
    }

System.out.println(sum);
}
}


/*1^2+2^2+3^2+....+n
import java.util.Scanner;

public class seies2 
{

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int sum=0;
    int n;
    System.out.println("Enter initial number = ");
    n=input.nextInt();

    for(int i=1;i<=n;i=i*i)
    {
        System.out.println(" "+i);
        sum=sum+i;
    }

System.out.println(sum);
}
    
}
*/
