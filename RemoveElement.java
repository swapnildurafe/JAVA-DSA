class RemoveElement{

    public static int rem(int[] nums, int digit){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != digit){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int digit = 3;
        System.out.println(rem(nums,digit));
    }
}