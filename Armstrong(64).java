/*
an n-digit number, then it is an Armstrong number if and only if a^n + b^n + c^n + ... = abc

153=1^3+5^3+3^3=153

 temp=n;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }

        video 63
*/

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,r,sum=0,temp=0;
        System.out.println("Enter a number = ");
        n=input.nextInt();
        
        temp=n;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("Armstrong Number");
        }
        else 
        System.out.println("Not a armstrong Number");
    }
}

output:
Enter a number = 
5
Not a armstrong Number
