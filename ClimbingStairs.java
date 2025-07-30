// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
import java.util.*;
class ClimbingStairs{
    public static int c_stairs(int n){
        if(n<=3){
            return n;
        }
        int a = 3;
        int b = 2;
        for(int i=0;i<n-3;i++){
            a = a+b;
            b = a-b;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(c_stairs(n));
    }
}