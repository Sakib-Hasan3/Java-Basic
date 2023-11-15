//video 80
/*         0 1 2 3 4     
         5 6 7 8 9     
         10 11 12 13 14
         15 16 17 18 19 */

public class output {
public static void main(String[] args) {
    int number[][]=new int[4][5];
    int k=0;
//assign the value of array
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<5;j++)
        {
            number[i][j]=k;
            k++;
        }
    }
//print the value
for(int i=0;i<4;i++)
    {
        System.out.print("\t");
        for(int j=0;j<5;j++)
        {
          System.out.print(" "+number[i][j]);
        }
        System.out.println();
    }
}    

}

//output

     0 1 2 3 4
         5 6 7 8 9
         10 11 12 13 14
         15 16 17 18 19
