import java.util.*;
public class functions5 {
    public static int avg(int a, int b, int c)
    {
        int average = (a + b + c) / 3 ;
        System.out.println("The average of three numbers is: "+average);
        return average;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        avg(a,b,c);
    }
    
}
