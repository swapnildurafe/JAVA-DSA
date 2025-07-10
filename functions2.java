import java.util.*;
public class functions2 {
    public static int calculateSum(int a, int b)
    {
        int sum= a + b ;
        System.out.println("The sum is: "+sum);
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        int sum= calculateSum(a, b);
    }

    
}
