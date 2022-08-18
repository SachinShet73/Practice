

class Practice{
    public static void main(String args[])
    {
       
        for(int row = 1;row<=5;row++)
        {
            for(int col = 1;col<=1;col++ )
        {
            System.out.print(" ");
        }
        
            for(int col2 = 1 ; col2<= 5; col2++)
        {
            if(row == 2||row == 3||row == 4)
            {
                if( col2==2|| col2==3|| col2==4)
                {   
                    System.out.print(" ");
                }

                if(col2 ==1||col2==5)
                { 
                    System.out.print("*");
                }
            }
                else
                {
                    System.out.print("*");
                }
        }

        System.out.println();
    }
}
}

