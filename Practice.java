import javax.lang.model.util.ElementScanner14;

class Practice{
    public static void main(String args[])
    {
       
        for(int row = 1;row<=5;row++)
        {
            for(int space = row;space<=5;space++)
            {
                System.out.print(" ");
            }
            for(int hash = 1;hash<=row*2-1;hash++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

        for(int row = 1;row<=5;row++)
        {
            for(int space =1;space<=1;space++)
            {
                System.out.print(" ");
            }
            for(int hash = 1;hash<=3;hash++)
            {
                System.out.print("#");
            }
            for(int hash = 1;hash<=3;hash++)
            {
                System.out.print(" ");
            }

            for(int hash = 1;hash<=3;hash++)
            {
                System.out.print("#");
            }
            System.out.println();
        }   
    }
}


