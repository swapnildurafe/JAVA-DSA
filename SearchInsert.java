// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Input: nums = [1,3,5,6], target = 2
// Output: 1
public class SearchInsert{

    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.print(search(nums,target));
    }
    public static int search(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
            else if(nums[i] > target){
                return i;
            }
        }
        return nums.length+1;
    }
}