import java.util.*;
import java.io.*; 
public class missing_number {
    public static int missingNumber(int[] arr, int n)
    {
        Arrays.sort(arr);
        n = arr.length;
        int counter = 1;
        for(int i=0;i<n;i++)
        {
            if(arr[i] <= 0)
            {
                continue;
            }
            if(arr[i] == counter)
            {
                counter ++;
            }
            else if(arr[i] > counter)
            {
                return counter;
            }
        }
        return counter;
    }
}
