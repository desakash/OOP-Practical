import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Read the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Remove repeated elements from the array
        arr = removeDuplicates(arr);

        // Print the resulting array
        System.out.println("Array with repeated elements removed:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] uniqueArr = new int[n];
        int uniqueCount = 0;

        // Iterate over the input array
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element is already present in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the current element is not a duplicate, add it to the unique array
            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        // Create a new array with the unique elements
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueArr[i];
        }

        return result;
    }
}
