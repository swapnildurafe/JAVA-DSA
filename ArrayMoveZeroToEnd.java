// [1,2,0,3,0,4,0,5,6]  ---> [1,2,3,4,5,6,0,0,0] ---> n=9
import java.util.*;
public class ArrayMoveZeroToEnd {

    public static void move(int [] arr){

        int n = arr.length;
        int[] temp = new int[n];
        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i=0; i<n;i++){
            arr[i]=temp[i];
        }       
        for(int i=n;i<n;i++){
            arr[i]=0;
        }
    }

    public static void swap(int[] arr, int num1, int num2){

        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
// int[] arr = {1,2,3,4,5,6,6,0,2,1,0,0,4,5,0};
    public static void move2(int[] arr){

        int n = arr.length;
        int j = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i] != 0){
                swap(arr, i,j);
                j++;
            }
        }
    }
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,6,0,2,1,0,0,4,5,0};
        move2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}