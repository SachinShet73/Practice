import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Practice{
    public static void main(String args[])
    {
       
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = (a + b + c);

       System.out.print(sum + ((sum*18)/100));
    }
}


