// Input: nums = [2,2,1]
// Output: 1
import java.util.*;
class SingleNumber {
    public static int find(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(Integer key : hm.keySet()){
            if(hm.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {2,2,1};
        System.out.print(find(nums));
    }
}