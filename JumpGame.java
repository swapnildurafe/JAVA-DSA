// Input: nums = [2,3,1,1,2]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

class JumpGame{
    public static boolean isJump(int[] nums){
        int lastPos = nums.length;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i] >= lastPos){
                lastPos = i;
            }
        }
        return lastPos ==0;
    }
    public static void main(String[] args){
        int[]nums = {2,1,0,1};
        System.out.print(isJump(nums));
    }
}