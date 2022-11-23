import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Practice{
    /**
     * @param args
     */
    public static void invertedPyramidHollow(int totlength)
     {
        for(int row = 1 ; row<=totlength;row++)
        {
            for(int col = 1 ; col<=totlength-row+1; col++)
            {
                    if(row == 1|| col == 1 || col==totlength-row+1)
                    {
                    System.out.print("*");
                    }
                    else
                    {
                    System.out.print(" ");
                    }
            }
            System.out.println();    
        }
            
        }
     
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of the half pyramid");
    int n = sc.nextInt();
    invertedPyramidHollow(n);
    }
}
