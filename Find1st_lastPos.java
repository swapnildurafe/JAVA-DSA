// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
import java.util.*;
class Find1st_lastPos{

    public static int[] find(int[] nums,int target){
        int[] result = new int[2];
        result[0] = result[1] = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                result[0] = i;
                while(i<nums.length && nums[i+1] == target){
                    i++;
                    result[1] = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.print(Arrays.toString(find(nums,target)));
    }
}