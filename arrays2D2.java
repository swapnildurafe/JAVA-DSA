import java.util.*;
public class arrays2D2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter Columns: ");
        int cols = sc.nextInt();
        int [][] numbers =new int[rows][cols];

        //input
        System.out.println("Enter numbers in the matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }

        //Find x
        System.out.print("Enter the number to Find: ");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(numbers[i][j]==x)
                {
                    System.out.print("Numbers Found At Location "+"["+i+"]"+"["+j+"]");
                }
            }
        }
    }
}
