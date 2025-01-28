import java.util.*; 
import java.io.*; 

public class equilibrium {

    public static int arrayEquilibriumIndex(int[] arr) {  
        int n = arr.length;

        // Edge case: if array is empty or has only one element
        if (n == 0) return -1;

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            // Check if left and right sums are equal
            if (leftSum == rightSum) {
                return i; // Found the equilibrium index
            }

            // Update the left sum to include the current element
            leftSum += arr[i];
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of the array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arrayEquilibriumIndex(arr));
        sc.close();
    }
}
