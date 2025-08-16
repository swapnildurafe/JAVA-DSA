// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
class MaxArraySubArray{

    public static double findMaxAverage(int[] nums, int k){
        int max_sum = 0;
        int current_sum = 0;
        for(int i=0;i<k;i++){
            current_sum = current_sum + nums[i];
        }
        max_sum = current_sum;
        for(int i=k;i<nums.length;i++){
            current_sum = current_sum + nums[i] - nums[i-k];
            if(current_sum > max_sum){
                max_sum = current_sum;
            }
        }
        return (double)max_sum/k;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 9;
        System.out.print(findMaxAverage(nums,k));
        // int[] num2 = {6,7,8,9};
        // int j = 9;
        // System.out.print(findMaxAverage(num2,j));

        int[] num3 = {63,65,69,75,79};
        int l = 6;
        System.out.print(findMaxAverage(num3,l));
    }
}