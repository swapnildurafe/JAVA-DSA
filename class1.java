import java.util.*;
class class1 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        // 3 methods to print the array

        System.out.println("The arrays are:"+Arrays.toString(arr));
        // for(int j=0; j<arr.length; j++){
        //     System.out.print(arr[j] + " ");

        // for(int num : arr){
        //     System.out.print(num + " ");
        // }


        }

    }
