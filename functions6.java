import java.util.*;
public class functions6 {
    public static int odd(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if (i%2 != 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("The sum of "+n+" odd number is "+sum);
        return sum;
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        odd(n);
    }
}
