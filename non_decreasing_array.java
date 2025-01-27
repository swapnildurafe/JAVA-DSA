import java.util.Scanner;

public class non_decreasing_array {
    public static boolean isPossible(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i == 0 || arr[i - 1] <= arr[i + 1]) {
                    arr[i] = arr[i + 1]; // Modify arr[i]
                } else {
                    arr[i + 1] = arr[i]; // Modify arr[i + 1]
                }
            }
        }
        return true; // If no more than one modification is needed
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = sc.nextInt(); // Size of array
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt(); // Input array elements
            }
            System.out.println(isPossible(arr)); // Output true/false
        }
        sc.close();
    }
}
