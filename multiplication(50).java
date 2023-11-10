/*
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

video 51
*/
import java.util.Scanner;

public class multiplication {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int multiplication=0;
    System.out.println("Enter any Number= ");
    num=input.nextInt();

    for(int i=1;i<=10;i++)
    {
    
        System.out.println( num + "X"+i + "=" +num*i);
    }
    //System.out.println("Multiflication of " +num + "=" +multiplication);
    
    
}    
}
/* output 
  Enter any Number= 
5
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
  */
  
