//video 52
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m;
        System.out.println("Enter Number = ");
        m=input.nextInt();
        int count=0;
        
        for(int i=2;i<m;i++)
        {
            if(m%i==0)
            {
               count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("prime number");
        }
        else
            {
                System.out.println("Not a prime number");
            }
        }
    
}
/* output 
  
Enter Number = 
4
Not a prime number 
  */
