import java.util.Scanner;

public class KSmallestIntegers {
    public static boolean isDivisibleByAny(int num, int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (num % arr[i] == 0) {
                return true; // 'num' is divisible by at least one element in 'arr'
            }
        }
        return false; // 'num' is not divisible by any element in 'arr'
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array and the array elements
        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int[] kSmallest = new int[k];
        int current = 1;
        int found = 0; // Number of found k smallest integers

        while (found < k) {
            if (!isDivisibleByAny(current, arr, n)) {
                kSmallest[found] = current;
                found++;
            }
            current++;
        }

        // Calculate the sum of the k smallest integers
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += kSmallest[i];
        }

        // Print the sum
        System.out.println("Sum of the " + k + " smallest integers not divisible by any of the array elements: " + sum);

        scanner.close();
    }
}
