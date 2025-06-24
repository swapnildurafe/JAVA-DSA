import java.util.*;
public class ArraySwap {
    
    
    static void swap(int[] arr, int index1, int index2){

        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }


// {1,2,3,4,5}

    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args){

        int [] arr ={1,2,3,4,5};
        // swap(arr,0,1);
        // System.out.println("After swapping: "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reversing: "+Arrays.toString(arr));
    }
    
}
