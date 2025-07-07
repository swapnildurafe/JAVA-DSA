public class test {
    public static void main(String[] args) {
        int nums[]={1,1,2};
        System.out.println(removeDuplicates(nums));

    }

    public static int main removeDuplicates(int[] nums)
    {
        int count;
        for(int i=0;i<nums.length;i++)
        {
            if(i<nums.length-1 && nums[i]==nums[i+1]  )
            {
                continue;
            }

            else{
                nums[count]=nums[i];
            }
        }
        return count;
        count++;
    }
}