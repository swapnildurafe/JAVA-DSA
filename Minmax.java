import java.util.*;
public class Minmax {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long totalSum= 0;
        for (int i=0;i<arr.size();i++)
        {
            int num = arr.get(i);
            totalSum += num;
        }
        long max_sum = totalSum - Collections.max(arr);
        long min_sum = totalSum - Collections.min(arr);
        
        System.out.println(max_sum+" "+min_sum);
    
    }
    }
    

