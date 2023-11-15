import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        int number[]={10,2,4,-10};
        Arrays.sort(number);
        
        System.out.println("Asccending = ");
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+number[i]);
        }
        System.out.println();

         System.out.println("Deccending = ");
        for(int i=4;i>=0;i--)
        {
            System.out.print(" "+number[i]);
        }
        System.out.println();
    }
}
//output
Ascending = 
 -10 2 4 10  
Descending = 
 10 4 2 -10  
