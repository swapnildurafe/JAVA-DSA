import java.util.*;
public class functions1 {
    public static void printMyName(String name)
    {
        System.out.println("Name is: "+name);
        return;
    }

    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name=sc.next();
        printMyName(name);
    }
}
