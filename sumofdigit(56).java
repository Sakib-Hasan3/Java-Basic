/* 
n=123
1+2+3=6
sum=0;

123%10=3=r , 123/10=12=temp
sum=0+3=3
12%10=2=r,  12/10=1=temp
sum=2+3=5
1%10=1=r,  1/10=0
sum=5+1=6

       temp=n;
        while(temp!=0)
        { 
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
            video 56 */

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;
        System.out.println("Enter NUmber ");
        n=input.nextInt();

        int sum=0;
        int temp,r;
        temp=n;


        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println(sum);
        


    }
    
}
