

class Practice{
    public static void main(String args[])
    {
       
        for(int row = 1;row<=5;row++)
        {
            for(int hashes = row*2-1 ;hashes>=1;hashes++)
                {
                  System.out.print(" ");

                  if(hashes == 10)
                  {
                    break;
                  }
                }

            for(int hashes = 1;hashes<=row*2-1;hashes++)
                {
                  System.out.print("#");
                }
                System.out.println();
        }     
        for(int i = 0;i<=5;i++)
        {
            for(int m = 1;m<=1;m++)
            {
                System.out.print(" ");   
            }    
        for(int j = 0;j<=9;j++)
        {
            System.out.print("#");   
        }
        System.out.println();
    }
    }
}

