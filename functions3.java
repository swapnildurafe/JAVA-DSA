import java.util.*;
public class functions3 {
    public static int calculateMultip(int a, int b)
    {
        int mul= a * b ;
        System.out.println("The multiplication is: "+mul);
        return mul;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        int sum= calculateMultip(a, b);
    }

    
}
