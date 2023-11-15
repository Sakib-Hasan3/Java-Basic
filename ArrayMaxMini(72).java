/*maximum=
double max=number[0];
  for( i=0;i<5;i++)
{
    
if(max<number[i])
  {
    max= number[i];
  }
}


minimum=
double min=number[0];
for( i=0;i<5;i++)
{
  if(min>number[i])
  {
    min= number[i];
  }
}
video 73

*/


import java.util.Scanner;

public class maximum {

   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

       int number[] = new int[5];
      
System.out.println("Enter 5 numbers = ");
for(int i=0;i<5;i++)
{
    number[i]=input.nextInt();
}

//number[0]=1
//number[1]=1
//number[2]=1
//number[3]=1
//number[4]=1
int i=0;
  double max=number[0];
  for( i=0;i<5;i++)
{
    
if(max<number[i])
  {
    max= number[i];
  }
}
double min=number[0];
for( i=0;i<5;i++)
{
  if(min>number[i])
  {
    min= number[i];
  }
}
  System.out.println("Max= "+max);
  System.out.println("Min = "+min);
}
}

output 
  Enter 5 numbers = 
1
2
3
4
5
Max= 5.0 
Min = 1.0
