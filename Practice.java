import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Practice{
    /**
     * @param args
     */
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find the factorial of");
    int n = sc.nextInt();
    int factorial = n;
    int i = n;
    while( i>0)
    {   
        if(n==1)
        {
            break;
        }
        factorial = factorial*(n-1);
        n--;
        i--;
    }
 
    System.out.println("The factorial of the number is " + factorial);

    
  
}
}

