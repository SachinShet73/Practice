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

    public static void hollow_rhombus(int n)
    {
        for(int row = 1;row<=n;row++)
        {
            
            for(int space = 1 ; space<=n-row ;space++)
            {
            System.out.print(" ");
            }
            
            for(int star = 1;star<=n;star++)
            {
                if(row ==1||row==n||star==n||star==1)
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

    public static void solid_rhombus(int n)
    {
        for(int row = 1;row<=n;row++)
        {
            
            for(int space = 1 ; space<=n-row ;space++)
            {
            System.out.print(" ");
            }
            
            for(int star = 1;star<=n;star++)
            {
               System.out.print("*");
            }

            System.out.println();
        }


    }   

    public static void zero_one_triangle(int totlength)
    {  
      
        byte p = 1;
       for(int row = 1 ; row<=totlength;row++)
       {   
           for(int col = 1 ; col<=row; col++)
           {
                if((row+col)%2==0)
                {
               System.out.print(1 + " ");
                }
                else
                {
                    System.out.print(0 +" ");
                }

           }
           System.out.println();    
       }
    }

    public static void diamond(int n)
    {
        for (int row = 1; row<=n; row++)
        {
            for (int space = 1;space <= n+1-row;space++)
            {
                System.out.print(" ");
            }

            for (int star = 1;star <= 2*row-1 ;star++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        
        for (int row = 1; row<=n-1; row++)
        {
            for (int space = 1;space <= row+1;space++)
            {
                System.out.print(" ");
            }

            for (int star = 1;star <= (n*2)-2*row-1 ;star++)
            {
                System.out.print("*");
            }

            System.out.println();
        }   
    }

    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input for hollow rhombus pattern");
    int n = sc.nextInt();

    diamond(n);

    }
}


