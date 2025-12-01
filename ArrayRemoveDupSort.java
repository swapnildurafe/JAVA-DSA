    public class ArrayRemoveDupSort{

        public static int r_duplicate(int[] arr){
            int i=0;
            for(int j=1;j<arr.length;j++){
                if(arr[i] != arr[j])
                {
                    arr[i+1]= arr[j];
                    i++;
                }
            }
            return i+1;
        }

        public static void main(String[] args){
            int[] arr = {1,2,2,3,3,4,4,5,5,5,5,6,6,6,6,7,8,9,9};
            int result = r_duplicate(arr);
            System.out.println(result);

            for(int i=0;i<result;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }