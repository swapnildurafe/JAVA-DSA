// Input: nums = [1,3,0,0,2,0,0,4]
// Output: 6

class NumberOfZeroFilled{
    public static int find(int[] arr){
        int streak = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                streak++;
                count = count + streak;
            }
            else{
                streak = 0;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,3,0,0,2,0,0,4};
        System.out.print(find(arr));
    }
}