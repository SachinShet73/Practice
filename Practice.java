import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Practice{
    /**
     * @param args
     */
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int n;
    do
    {
    System.out.println("Enter a multiple of 10");
    n = sc.nextInt(); 
        if(n%10==0 && n>=10)
        {
            break;
        }

    }while(true);
    

    
  
}
}

