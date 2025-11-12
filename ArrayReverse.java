// import java.util.*;
// public class ArrayReverse{
    
//    static void swap(int [] a, int num1, int num2) {

//     int temp  = a[num1];
//     a[num1]   = a[num2];
//     a[num2]   = temp;
//    }
//     static void reverse(int[]a) {
//         int start = 0;
//         int end   = a.length-1;
//         while(start<end){
//             swap(a,start,end);
//             start++;
//             end--;
//         }
//     }

//     public static void main(String[] args){

//         int[] a = {1,2,3,4,5,6};
//         reverse(a);
//         System.out.print(Arrays.toString(a));
//     }
// }

import java.util.*;
class ArrayReverse{
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}