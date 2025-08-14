import java.util.*;
class MissingNumber{
    public static int findMissing(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args){

        int[] nums = {0,1,2,3,5,6};
        System.out.println(findMissing(nums));
    }
}