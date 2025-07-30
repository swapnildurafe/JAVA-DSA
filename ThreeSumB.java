// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
import java.util.*;
class ThreeSumB {

    public static List<List<Integer>> threesum(int[] nums){
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplets = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplets);
                        result.add(triplets);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,4};
        System.out.print(threesum(nums));
    }
}