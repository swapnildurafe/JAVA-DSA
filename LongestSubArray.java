// arr = {1,2,3,1,1}
import java.util.*;
public class LongestSubArray{

    public static int LongestArray(int[] arr, int k){
        int maxLength = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                if(sum <= k){
                    int currLength = j-i+1;
                    maxLength = Math.max(maxLength,currLength);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1};
        int k = 5;
        System.out.print("The longest subarray is "+ LongestArray(arr,k));
    }
}