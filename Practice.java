import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Practice{
    /**
     * @param args
     */
    public static void floyds_triangle(int totlength)
     {  
        int p =1;
        for(int row = 1 ; row<=totlength;row++)
        {   
            
            for(int col = 1 ; col<=row; col++)
            {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();    
        }
            
        }
     
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of the half pyramid");
    int n = sc.nextInt();
    floyds_triangle(n);
    }
}
