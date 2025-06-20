public class ArrayMaxValue {
    public static void main(String[] args){

        int [] arr ={2,3,4,5,6};
        System.out.println(max1(arr));

    }   
        static int max1(int[] arr){
            int max =arr[0];
        

            for(int i=1;i<arr.length;i++){
                if (arr[i]> max){

                    max = arr[i];                }
            }
            return max;
        }
    }
