import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Practice{
    /**
     * @param args
     */
    public static void butterfly(int totlength)
     {  
         
        for(int row = 1 ; row<=totlength;row++)
        {   
            
            for(int star = 1 ; star<=row; star++)
            {
                System.out.print("*");
            }

            for(int space = 1;space<= (totlength*2+2)-2*row; space++)
            {
                System.out.print(" ");
            }

            for(int star = 1;star<=row;star++)
            {
                System.out.print("*");
            }

            System.out.println();    
        }

        for(int divider = 1;divider<=totlength*2+2;divider++)
        {
            System.out.print("*");
           
        }
        System.out.println(); 
        for(int row = 1 ; row<=totlength;row++)
        {   
            
            for(int star = 1 ; star<=totlength-row+1; star++)
            {
                System.out.print("*");
            }

            for(int space = 1; space<=2*row ; space++)
            {
                System.out.print(" ");
            }

            for(int star = 1 ;star<=totlength-row+1;star++)
            {
                System.out.print("*");
            }

            System.out.println();    
        }

        }
     
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input for butterfly pattern");
    int n = sc.nextInt();
    butterfly(n);
    }
}
