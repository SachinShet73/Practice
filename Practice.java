import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Practice{
    public static void main(String args[])
    {
       
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;
        int sum = 0;

        while(val<=n)
        {
            sum = sum + val;
            val = val+1;
        }
        System.out.println("The sum of the first n natural numbers for the given number n is "+sum);
    }
}


