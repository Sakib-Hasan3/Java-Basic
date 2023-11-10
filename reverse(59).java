/*
 sum of reverse 

 num=123
 reverse sum=6
     temp=num;
     while(temp!=0)
     {
        r=temp%10;
        sum=sum+r;
        temp=temp/10;
     }
     video 59
 */

import java.util.Scanner;

public class reverse 
{
public static void main(String[] args) 
 {
     Scanner input=new Scanner(System.in);
     int num,sum=0,temp,r;
     System.out.println("Enter any number= ");
     num=input.nextInt();

     temp=num;
     while(temp!=0)
     {
        r=temp%10;
        sum=sum+r;
        temp=temp/10;
     }
     System.out.println("Reverse = "+sum);
 }    
}
