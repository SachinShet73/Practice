

class Practice{
    public static void main(String args[])
    {
       
        for(int row = 1;row<=5;row++)
        {
            for(int s = 1;s<=row;s++)
                {
                    System.out.print(" ");
                }
            for(int h = 1;h<=11-row*2;h++)
                {
                    if(row==1||row==5||h==1||h==11-row*2)
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

