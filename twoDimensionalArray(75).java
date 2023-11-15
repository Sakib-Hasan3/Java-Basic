//video 75

/*
 *  1 2 3
 4 5 6
 */

public class twodimensionalarray {
    public static void main(String[] args) {
        int num[][]=new int[2][3];

        num[0][0]=1;
          num[0][1]=2;
            num[0][2]=3;
              num[1][0]=4;
                num[1][1]=5;
                  num[1][2]=6;

                  for(int row=0;row<2;row++)
                  {
                    for(int col=0;col<3;col++)
                    {
                        System.out.print(" "+num[row][col]);
                    }
                    System.out.println();
                  }


    }
    
}

//output
  1 2 3
 4 5 6 
  
