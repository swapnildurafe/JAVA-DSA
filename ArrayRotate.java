// arr = {1,2,3,4,5,6,7}  d=2 n=7
//        0 1 2 3 4 5 6 
//       {1,2} 
import java.util.*;
class ArrayRotate{
    public static void rotate(int[] arr, int d){
        int[] temp = new int[d];
        int n = arr.length;
        
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
    }

    public static void swap(int[] arr, int num1, int num2){

            int temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
    }
        // [1,2,3,4,5]
    public static void reverse(int[] arr,int start, int end){
            
            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }

    public static void rotate1(int[] arr, int d){

        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the value of k (rotations): ");
        int d = sc.nextInt();

        rotate1(arr,d);
        System.out.print("Rotated array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
}