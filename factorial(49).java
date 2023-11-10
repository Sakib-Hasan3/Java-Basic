/*5!=5*4*3*2*1
 4!=4*3*2*1
 3!=3*2*1
 video 50
 */


import java.util.Scanner;

public class factorial {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int num;
    int fact=1;
    
    num=input.nextInt();

    for(int i=num;i>=1;i--)
    {
        fact=fact*i;
    }
    System.out.println("Factorial of"  +num +" = "+fact);
   }    

}
/* output 
  5
Factorial of5 = 120 */
  
