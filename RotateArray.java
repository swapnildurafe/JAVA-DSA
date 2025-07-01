import java.util.Arrays;    
public class RotateArray {
    public static void main(String[] args) 
    {
      int[] nums={1,2,3,4,5,6,7};
      int k=3;
      System.out.println(Arrays.toString(Rotate(nums,k)));
    }

    public static int[] Rotate(int[] nums, int k)
    {
      int n=nums.length;
       k=k%n;
      Reverse(nums,0,n-1);
      Reverse(nums,0,k-1);
      Reverse(nums,k,n-1);
      return nums;
    }

    public static void Reverse(int[] nums, int start, int end)
    {
    while(start<=end)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
    }
}
