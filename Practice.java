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
                if(row == 1||hash == 1||hash == row*2-1)
                {System.out.print("#");}
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for(int row = 1;row<=4;row++)
        {
            for(int space =1;space<=row+1;space++)
            {
                System.out.print(" ");
            }
            for(int hash = 1;hash<=9-2*row;hash++)
            {
                if(row == 4||hash == 1||hash == 9-2*row)
                {System.out.print("#");}
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

