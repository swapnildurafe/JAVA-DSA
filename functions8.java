import java.util.*;
public class functions8 {
    public static void fibonacci(int count)
    {
        int n1=0;
        int n2=1;
        int n3;
        for(int i=2;i<=count;i++)
        {
             n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            

        }
    }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int count = sc.nextInt();
            fibonacci(count);
        }
}
