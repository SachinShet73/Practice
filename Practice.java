

class Practice{
    public static void main(String args[])
    {
       
        for(int row = 1;row<=5;row++)
        {
            for(int s = row;s<=5;s++)
                {
                    System.out.print(" ");
                }
            for(int h = 1;h<=2*row-1;h++)
                {
                    if(row==1||row==5||h==1||h==2*row-1)
                    {
                    System.out.print("#");
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
                }    
                System.out.println();
        }

        System.out.println();
    }
}

