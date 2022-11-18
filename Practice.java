import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Practice{
    /**
     * @param args
     */
    public static void main(String args[])
    {
    String option;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an option");
    option = sc.next();
    switch (option)
    {
        case "mango": System.out.println("Here is your mango shake");
        break;

        case "apple": System.out.println("Here is your apple shake");
        break;

        case "banana": System.out.println("Here is your banana shake");
        break;

        default : System.out.println("Here is your "+option+" shake");
        break;
    }
    }
}


