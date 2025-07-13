import java.util.* ;
public class functions4 {
    public static void printFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("Factorial is not possible for negative numbers");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println("The factorial of " +factorial);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        printFactorial(n);
    }
}
