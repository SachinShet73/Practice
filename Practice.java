

class Practice{
    public static void main(String args[])
    {
        int[][] arr ;
        for(int row = 1;row<=5;row++)
        {
            for(int col = 1;col<=row;col++ )
        {
            System.out.print(" ");
        }
        
            for(int col2 = 1 ; col2<= 11-2*row; col2++)
        {
            System.out.print("*");
        }

        System.out.println();
    }
}
}

