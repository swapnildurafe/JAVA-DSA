// Input: nums = [1,2,3,1]
// Output: true

import java.util.*;
class ConatinsDuplicate{
    public static boolean isContain(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                return true;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[] nums = {1,2,3,3,4};
        System.out.print(isContain(nums));
    }
}