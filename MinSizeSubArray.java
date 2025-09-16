class MinSizeSubArray{
    public static int findMin(int[] nums, int target){
        int high = 0;
        int low = 0;
        int currentSum = 0;
        int minLenWindow = Integer.MAX_VALUE;
        for(high = 0; high<nums.length; high++){
            currentSum = currentSum + nums[high];
            while(currentSum >= target){
                int currentLenWindow = high - low + 1;
                minLenWindow= Math.min(minLenWindow,currentLenWindow);
                currentSum = currentSum - nums[low];
                low++;
            }     
        }
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,3,4,7};
        int target = 7;
        System.out.println(findMin(nums,target));
    }
}