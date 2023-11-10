//sum m to n
import java.util.Scanner;

public class sum2 
{

    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int m,n;
        int sum=0;
        System.out.println("Enter initial number = ");
        m=input.nextInt();
        
        System.out.println("Enter final number = ");
        n=input.nextInt();

        for(int i=m;i<=n;i++)
        {
            sum=sum+i;
        }
System.out.println(" The sum is = " +sum);
    }
   
    
}

/* Enter initial number = 
10
Enter final number = 
5
 The sum is = 0
  */
