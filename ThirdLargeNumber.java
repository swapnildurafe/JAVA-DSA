class ThirdLargeNumber{
    public static int find_large(int[] nums){
        
        long large = Long.MIN_VALUE;
        long sec_large = Long.MIN_VALUE;
        long third_large = Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > large){
                large = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>sec_large && nums[i] < large){
                sec_large = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>third_large && nums[i] < sec_large){
                third_large = nums[i];
            }
        }
        if(third_large == Long.MIN_VALUE){
            return (int) large;
        }
        return (int) third_large;
    }

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6};
        System.out.print(find_large(nums));
    }
}