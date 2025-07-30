// Input: nums = [-1,0,1,2,-1,-4]
// sort        = [-4,-1,-1,0,1,2]
// Output: [[-1,-1,2],[-1,0,1]]

import java.util.*;
class ThreeSumO{

    public static List<List<Integer>> threesumO(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.print(threesumO(nums));
    }
}