class second_largest
{
    public static int secondlargest(int n, int[] arr)
    {
        
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if (arr[i]>largest)
            {
                sec_largest = largest;
                largest= arr[i];
            }
            else if(arr[i]>sec_largest && arr[i] != largest)
            {
                sec_largest=arr[i];
            }
        }
        return (sec_largest==Integer.MIN_VALUE) ? -1 : sec_largest;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,5,2,3,4};
        int result = secondlargest(arr.length, arr);
        System.out.println(result);

    }
}